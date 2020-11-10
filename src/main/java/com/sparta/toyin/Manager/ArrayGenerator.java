package com.sparta.toyin.Manager;

import com.sparta.toyin.View.UserInput;

import java.util.Arrays;
import java.util.Random;


public class ArrayGenerator {

    public static int[] generatingArray(int[] input) {

        Random random = new Random();
        int upperBoundary = 100;
        for (int i = 0; i < input.length; i++) {
            input[i] = random.nextInt(upperBoundary) +1;
        }
        Log.testLog(Arrays.toString(input), "The random array produced is: ");
        return input;
    }

    public static int[] generatingUniqueArray(int [] input) {

        Random random = new Random();
        int upperBoundary = 100;
        for (int i = 0; i < input.length; i++) {
            input[i] = random.nextInt(upperBoundary) +1;
            i = uniqueRandomizer(input, i);
        }
        Log.testLog(Arrays.toString(input), "The random array produced is: ");
        return input;
    }

    private static int uniqueRandomizer(int[] input, int i) {
        for (int j = 0; j < i; j++) {
            if (input[i] == input[j]) {
                i--;
                break;
            }
        }
        return i;
    }
}
