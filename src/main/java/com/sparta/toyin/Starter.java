package com.sparta.toyin;

import com.sparta.toyin.Sorters.BinaryTreeImpl;
import com.sparta.toyin.Sorters.SortFactory;
import com.sparta.toyin.Sorters.Sorter;
import com.sparta.toyin.View.Printer;
import com.sparta.toyin.View.UserInput;

public class Starter {

    public static void start() {

        int[] input = ArrayGenerator.generatingArray();
        int sorterChoice = UserInput.userInputSorter();
        SortFactory sortFactory = new SortFactory();
        Sorter sorter = sortFactory.getSorter(sorterChoice);
        int[] arrayCopy = new int[input.length];
        System.arraycopy(input, 0,arrayCopy,0,input.length);
        int[] output = sorter.sortArray(arrayCopy);
        Printer.print(input,output);
    }
}
