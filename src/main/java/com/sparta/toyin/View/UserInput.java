package com.sparta.toyin.View;

import com.sparta.toyin.Exceptions.InvalidInputException;
import com.sparta.toyin.Log;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInput {

    public static int userInputArrays() {

        Scanner scanner = null;
        int input = 0;
        try {
            System.out.println("Please enter the length of the array you wish to create");
            scanner = new Scanner(System.in);
            input = scanner.nextInt();
        } catch (InputMismatchException e) {
            Printer.print(e);
        }catch (Exception e) {
            Printer.print(e);
        }
        Log.testLog(input, "The user input for array size was: ");
        return input;
    }

    public static int userInputSorter() {
        Scanner scanner = null;
        int input = 0;
        try {
            System.out.println("Please choose which Sort algorithm you would like to use:");
            System.out.println("\n1:: Bubble Sort \n2:: Merge Sort \n3:: Binary Tree Sort ");
            scanner = new Scanner(System.in);
            input = scanner.nextInt();
            if (input > 3 || input < 1) {
                throw new InvalidInputException("You must enter 1,2 or 3.");
            }
        } catch (InputMismatchException| InvalidInputException e) {
            Printer.print(e);
        } catch (Exception e) {
            Printer.print(e);
        }
        Log.testLog(input, "The user choice for the sort algorithm to use was: " );
        return input;

    }

    public static int userInputRootElement() {
        Scanner scanner = null;
        int input=0;
        try {
            System.out.println("Please enter a value to become the root element of the binary tree::");
            input = scanner.nextInt();
            return input;
        } catch (InputMismatchException e) {
            Printer.print(e);
        } catch (Exception e) {
            Printer.print(e);
        }
        return input;
    }


}
