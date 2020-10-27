package com.sparta.toyin;

import com.sparta.toyin.View.UserInput;

import java.util.Arrays;
import java.util.Random;


public class ArrayGenerator {

    public static int[] generatingArray() {

        Random random = new Random();
        int[] input = new int[UserInput.userInputArrays()];
        int upperBoundary = 100;
        for (int i = 0; i < input.length; i++) {
            input[i] = random.nextInt(upperBoundary);
        }

        Log.testLog(Arrays.toString(input), "The random array produced is: ");
        return input;
    }
}
