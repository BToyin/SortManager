package com.sparta.toyin.Sorters;

public class MergeSorter implements Sorter {

    public static int[] mergeArrays(int[] array ,int[] array1, int[] array2) {

        int mergedArrayIndex = 0;

        int i = 0, j = 0;
        while (i < array1.length && j < array2.length) {
            if (array1[i] <= array2[j]) {
                array[mergedArrayIndex++] = array1[i++];
            } else {
                array[mergedArrayIndex++] = array2[j++];
            }
        }
        while (i < array1.length) {
            array[mergedArrayIndex++] = array1[i++];
        }
        while (j < array2.length) {
            array[mergedArrayIndex++] = array2[j++];
        }

        return array;
    }


    @Override
    public int[] sortArray(int[] arrayToSort) {

        if (arrayToSort.length <= 1) {
            return arrayToSort;
        }

        int[] arrayLeftHalf = new int[arrayToSort.length/2];
        int[] arrayRightHalf = new int[arrayToSort.length-arrayLeftHalf.length];
        int originalArrayIndexCounter = 0;

        while(originalArrayIndexCounter < arrayToSort.length/2) {
            arrayLeftHalf[originalArrayIndexCounter] = arrayToSort[originalArrayIndexCounter];
            originalArrayIndexCounter++;
        }

        for(int i = 0; i < arrayToSort.length-arrayLeftHalf.length; i++){
            arrayRightHalf[i] = arrayToSort[originalArrayIndexCounter];
            originalArrayIndexCounter++;
        }

        sortArray(arrayLeftHalf);
        sortArray(arrayRightHalf);

        return mergeArrays(arrayToSort,arrayLeftHalf,arrayRightHalf);
    }


}
