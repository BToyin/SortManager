package com.sparta.toyin;

import com.sparta.toyin.Sorters.BinaryTreeImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class BinaryTreeSortTest {

    static BinaryTreeImpl binaryTree;
    static int[] arrayToSortTest;
    static int[] sortedArrayTest;

    @BeforeAll
    static void setMergeSorter() {
        binaryTree = new BinaryTreeImpl();
        arrayToSortTest = new int[] {0, 96, 6, 96, 85, 63, 71, 37, 38, 38, 22, 47, 0, 28, 76, 90, 83, 57, 16, 72, 44, 4, 89, 82, 33, 40, 5, 27, 83, 64, 8, 47, 1, 63, 47, 39, 3, 70, 11, 7, 43, 85, 78, 4, 0, 62, 29, 56, 48, 58, 53, 99, 93, 24, 27, 97, 64, 12, 26, 10, 63, 29, 51, 49, 86, 48, 37, 78, 75, 45, 5, 54, 98, 80, 93, 2, 80, 44, 36, 77, 18, 31, 69, 59, 94, 35, 29, 19, 37, 73, 60, 51, 52, 81, 20, 91, 29, 50, 17, 4};
        sortedArrayTest = arrayToSortTest;
        Arrays.sort(arrayToSortTest);
    }

    @Test
    @DisplayName("Testing the Merge sort algorithm by using the built-in Java sorter with the same input")
    public void checkBinaryTreeSort() {
        Assertions.assertEquals(Arrays.toString(sortedArrayTest), Arrays.toString(binaryTree.sortArray(arrayToSortTest)));
    }
}
