package com.sparta.toyin.Sorters;

public class SortFactory {

    public Sorter getSorter(int number) {

        if (number == 0){
            return null;
        }
        else if (number==1) {
            return new BubbleSorter();
        }
        else if (number==2) {
            return new MergeSorter();
        }
        else if (number==3) {
            return new BinaryTreeImpl();
        }
        return null;
    }
}
