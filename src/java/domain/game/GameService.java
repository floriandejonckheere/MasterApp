/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.game;

/**
 *
 * @author florian
 */
public class GameService {

    public static Game instance = new Game();

    public Game getInstance() {
        return instance;
    }

    public void setInstance(Game game) {
        instance = game;
    }
}
