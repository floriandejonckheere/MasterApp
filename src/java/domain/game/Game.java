/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.game;

import java.util.Random;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Range;

/**
 *
 * @author florian
 */
public class Game {

    @NotNull
    @Range(min = 4, max = 8)
    private int number;

    // Visited hyperlinks
    private boolean[] visited;

    // Bomb hyperlink
    private int bomb;

    private boolean finished;
    private boolean won;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;

        Random random = new Random();

        this.visited = new boolean[number];
        this.bomb = random.nextInt(number);
    }

    public boolean[] getVisited() {
        return visited;
    }

    public void setVisited(boolean[] visited) {
        this.visited = visited;
    }

    public void visit(int i) {
        visited[i] = true;

        if (visited[bomb]) {
            finished = true;
            won = false;
            return;
        }
        
        int visitedCount = 0;
        for (boolean v : visited) {
            if (v) {
                visitedCount++;
            }
        }
        
        if (visitedCount == number - 1) {
            finished = true;
            won = true;
        }
    }

    public int getBomb() {
        return bomb;
    }

    public void setBomb(int bomb) {
        this.bomb = bomb;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    public boolean isWon() {
        return won;
    }

    public void setWon(boolean won) {
        this.won = won;
    }
}
