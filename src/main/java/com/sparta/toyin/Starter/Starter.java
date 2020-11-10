package com.sparta.toyin.Starter;

import com.sparta.toyin.Manager.ArrayGenerator;
import com.sparta.toyin.Sorters.SortFactory;
import com.sparta.toyin.Sorters.Sorter;
import com.sparta.toyin.View.Printer;
import com.sparta.toyin.View.UserInput;
import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

public class Starter {

    public static void start() {

        int [] input = new int[UserInput.userInputArrays()];
        input = ArrayGenerator.generatingUniqueArray(input);
        Weld weld = new Weld();
        WeldContainer weldContainer = weld.initialize();
        Sorter sorter = weldContainer.select(Sorter.class).get();
        int[] arrayCopy = new int[input.length];
        System.arraycopy(input, 0,arrayCopy,0,input.length);
        int[] output = sorter.sortArray(arrayCopy);
        Printer.print(input,output);
    }
}
