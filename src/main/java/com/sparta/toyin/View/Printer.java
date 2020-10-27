package com.sparta.toyin.View;

import com.sparta.toyin.Manager.Log;

import java.util.Arrays;

public class Printer {

    public static void print(String message){

        System.err.println(message);
    }

    public static void print(Exception exception){

        System.err.println("The Exception you received was:: " + exception.getMessage());
        Log.logException(exception);
    }

    public static void print(int[] input, int[] output) {

        System.out.println("The random array that was produced is: " + Arrays.toString(input));
        System.out.println("The sorted array given by your chosen algorithm is: " + Arrays.toString(output));
        Log.testLog(Arrays.toString(output), "The sorted array is: ");
    }

}
