package com.sparta.toyin.Sorters;

import com.sparta.toyin.Exceptions.ChildNotFoundException;
import com.sparta.toyin.Exceptions.ElementNotFoundException;
import com.sparta.toyin.Exceptions.EmptyArrayException;

public interface BinaryTree {

    int getRootElement();

    int getNumberOfElements() throws EmptyArrayException;

    void addElement(int element);

    void addElements(int[] elements);

    boolean findElement(int value);

    int getLeftChild(int element) throws ChildNotFoundException, ElementNotFoundException;

    int getRightChild(int element) throws ElementNotFoundException, ChildNotFoundException;

    int[] getSortedTreeAsc();

    int[] getSortedTreeDesc();

}
