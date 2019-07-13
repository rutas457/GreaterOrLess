package com.training;

import java.util.ArrayList;
import java.util.Scanner;



public class Controller {

    private Model model;
    private View view;

    public static int intervalStart = 0;
    public static int intervalEnd = 100;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        Scanner sc = new Scanner(System.in);
        model.generateGuessValue();
        view.printMessage(View.USER_GREETING);
        ArrayList<Integer> userValues = new ArrayList<Integer>();
        model.setUserValues(userValues);
        guessTheNumber(sc);
        view.printMessage(View.CONGRATULATION);
        view.printMessage(View.NUMBER_OF_TRIALS + model.getUserValues().size());
        view.printArrayList(model.getUserValues());
    }



    public int inputIntValueWithScanner(Scanner sc) {
        view.printMessage(View.INPUT_INT_DATA);
        while (!sc.hasNextInt()) {
            view.printMessage(View.WRONG_INPUT_INT);
            sc.next();
        }
        return sc.nextInt();
    }

    public void guessTheNumber(Scanner sc) {
        int chosenValue = intervalStart - 1;
        ArrayList<Integer> userValues = model.getUserValues();
        while (chosenValue != model.getGuessValue()) {
            chosenValue = inputIntValueWithScanner(sc);
            if(chosenValue < intervalStart || chosenValue > intervalEnd){
                view.printMessage(View.WRONG_INPUT_OUT_OF_RANGE);
                continue;
            }
            if (userValues.contains(chosenValue)) {
                view.printMessage(View.WRONG_INPUT_REPEATING);
                continue;
            }
            userValues.add(chosenValue);
            if (chosenValue > model.getGuessValue()) {
                view.printMessage(View.GREATER);
                intervalEnd = chosenValue;
                view.printArrayList(userValues);
                view.printMessage(View.RANGE + intervalStart + " " + intervalEnd);
            } else if (chosenValue < model.getGuessValue()) {
                view.printMessage(View.LESS);
                intervalStart = chosenValue;
                view.printArrayList(userValues);
                view.printMessage(View.RANGE + intervalStart + " " + intervalEnd);
            } else break;
        }
    }

}
