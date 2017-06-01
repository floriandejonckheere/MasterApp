/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.equation;

/**
 *
 * @author florian
 */
public class Equation {

    private int difficulty;
    private String operator;

    private int leftHand;
    private int rightHand;

    private int userResult;
    private int eqResult;
    
    private boolean correct;

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public int getLeftHand() {
        return leftHand;
    }

    public void setLeftHand(int leftHand) {
        this.leftHand = leftHand;
    }

    public int getRightHand() {
        return rightHand;
    }

    public void setRightHand(int rightHand) {
        this.rightHand = rightHand;
    }

    public int getUserResult() {
        return userResult;
    }

    public void setUserResult(int userResult) {
        this.userResult = userResult;
    }

    public int getEqResult() {
        return eqResult;
    }

    public void setEqResult(int eqResult) {
        this.eqResult = eqResult;
    }

    public boolean isCorrect() {
        return correct;
    }

    public void setCorrect(boolean correct) {
        this.correct = correct;
    }
}
