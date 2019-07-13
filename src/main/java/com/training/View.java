package com.training;

import java.util.ArrayList;
import java.util.Arrays;

public class View {
    public static final String USER_GREETING = "Hi! Welcome to the game \"Less or Greater\". \n" +
            "You`ll be given the random number from 0 to 100 to guess.\n" +
            "If your number is less than given, you`ll receive \"Less\", if greater - \"Greater\". \n" +
            "Your trials will be shown, so you shouldn`t repeat them! \n" +
            "Good luck!";
    public static final String INPUT_INT_DATA = "Input INT value = ";
    public static final String WRONG_INPUT_INT = "Wrong input! It`s not a number! ";
    public static final String WRONG_INPUT_REPEATING =
            "Wrong input! You`ve already tried this number ";
    public static final String GREATER = "Your number is GREATER";
    public static final String LESS = "Your number is LESS";
    public static final String CONGRATULATION = "Congratulations! You`ve successfully guessed the number! ";
    public static final String TRIALS = "You`ve already tried:  ";
    public static final String WRONG_INPUT_OUT_OF_RANGE = "This number is out of the interval ";
    public static final String RANGE = "Your number is in the interval ";
    public static final String NUMBER_OF_TRIALS = "Number of trials is: ";


    public void printMessage(String msg) {
        System.out.println(msg);
    }

    public void printArrayList(ArrayList<Integer> arrayList) {
        printMessage(TRIALS + Arrays.toString(arrayList.toArray()));
    }

}

