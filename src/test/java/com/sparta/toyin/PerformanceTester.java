package com.sparta.toyin;

import com.sparta.toyin.Sorters.BinaryTreeImpl;
import com.sparta.toyin.Sorters.BubbleSorter;
import com.sparta.toyin.Sorters.MergeSorter;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class PerformanceTester {

    static int[] input;

    @BeforeAll
    static void setInput() {
        input = new int[] {0, 96, 6, 96, 85, 63, 71, 37, 38, 38, 22, 47, 0, 28, 76, 90, 83, 57, 16, 72, 44, 4, 89, 82, 33, 40, 5, 27, 83, 64, 8, 47, 1, 63, 47, 39, 3, 70, 11, 7, 43, 85, 78, 4, 0, 62, 29, 56, 48, 58, 53, 99, 93, 24, 27, 97, 64, 12, 26, 10, 63, 29, 51, 49, 86, 48, 37, 78, 75, 45, 5, 54, 98, 80, 93, 2, 80, 44, 36, 77, 18, 31, 69, 59, 94, 35, 29, 19, 37, 73, 60, 51, 52, 81, 20, 91, 29, 50, 17, 4};
    }


    @Test
    @DisplayName("Testing BubbleSort performance")
    public void bubbleSortPerformance() {
        BubbleSorter bubbleSorter = new BubbleSorter();
        long start = System.nanoTime();
        bubbleSorter.sortArray(input);
        long end = System.nanoTime();
        System.out.println(end - start);
    }

    @Test
    @DisplayName("Testing MergeSort performance")
    public void mergeSortPerformance() {
        MergeSorter mergeSorter = new MergeSorter();
        long start = System.nanoTime();
        mergeSorter.sortArray(input);
        long end = System.nanoTime();
        System.out.println(end - start);
    }

    @Test
    @DisplayName("Testing BinaryTree sort performance")
    public void binaryTreeSortPerformance() {
        BinaryTreeImpl binaryTree = new BinaryTreeImpl();
        long start = System.nanoTime();
        binaryTree.sortArray(input);
        long end = System.nanoTime();
        System.out.println(end - start);
    }

    @Test
    @DisplayName("Testing BubbleSort performance")
    public void javaSortPerformance() {
        long start = System.nanoTime();
        Arrays.sort(input);
        long end = System.nanoTime();
        System.out.println(end - start);
    }


}
