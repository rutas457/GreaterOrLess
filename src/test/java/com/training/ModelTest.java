package com.training;

import org.junit.Test;

import static org.junit.Assert.*;

public class ModelTest {

    @Test
    public void generateGuessValue() {
        Model model = new Model();
        for(int i = 0; i < 10000; i++){
            model.generateGuessValue();
            assertNotEquals(0, model.getGuessValue());
            assertNotEquals(100, model.getGuessValue());
        }
    }
}