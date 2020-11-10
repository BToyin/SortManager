package com.sparta.toyin.Sorters;

import javax.enterprise.inject.Default;

@Default
public class BubbleSorter implements Sorter {

    @Override
    public int[] sortArray(int[] arrayToSort) {

        for (int i = 0; i < arrayToSort.length - 1; i++) {
            for (int j = 0; j < arrayToSort.length - 1 - i; j++) {
                if (arrayToSort[j] > arrayToSort[j + 1]) {
                    int tempNum1 = arrayToSort[j];
                    arrayToSort[j] = arrayToSort[j + 1];
                    arrayToSort[j + 1] = tempNum1;
                }
            }
        }
        return arrayToSort;
    }
}
