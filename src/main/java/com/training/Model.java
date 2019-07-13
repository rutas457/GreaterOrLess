package com.training;

import java.util.ArrayList;

public class Model {
    private int guessValue;
    private ArrayList<Integer> userValues;

    public static int intervalStart = 0;
    public static int intervalEnd = 100;


    public int getGuessValue() {
        return guessValue;
    }

    public void generateGuessValue() {
        guessValue = (int) ((Math.random() * intervalEnd - intervalStart-1) + intervalStart) + 1;
    }

    public ArrayList<Integer> getUserValues() {
        return userValues;
    }

    public void setUserValues(ArrayList<Integer> userValues) {
        this.userValues = userValues;
    }
}
