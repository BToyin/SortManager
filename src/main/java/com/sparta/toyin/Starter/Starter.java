package com.sparta.toyin.Starter;

import com.sparta.toyin.Manager.ArrayGenerator;
import com.sparta.toyin.Sorters.SortFactory;
import com.sparta.toyin.Sorters.Sorter;
import com.sparta.toyin.View.Printer;
import com.sparta.toyin.View.UserInput;

public class Starter {

    public static void start() {

        int sorterChoice = UserInput.userInputSorter();
        int [] input = new int[UserInput.userInputArrays()];
        if (sorterChoice == 3){
            input = ArrayGenerator.generatingRandomArray(input);
        } else {
            input = ArrayGenerator.generatingArray(input);
        }
        SortFactory sortFactory = new SortFactory();
        Sorter sorter = sortFactory.getSorter(sorterChoice);
        int[] arrayCopy = new int[input.length];
        System.arraycopy(input, 0,arrayCopy,0,input.length);
        int[] output = sorter.sortArray(arrayCopy);
        Printer.print(input,output);
    }
}
