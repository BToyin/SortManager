package com.sparta.toyin.Sorters;

import com.sparta.toyin.Exceptions.ChildNotFoundException;
import com.sparta.toyin.Exceptions.ElementNotFoundException;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Objects;


public class BinaryTreeImpl  implements BinaryTree, Sorter  {

    private Node rootElement;

    public BinaryTreeImpl(Node rootElement) {
        this.rootElement = rootElement;
    }

    public BinaryTreeImpl(){}


    public static class Node {
        private int value;
        private Node leftPointer;
        private Node rightPointer;

        public Node(int value) {
            this.value = value;
            this.leftPointer = null;
            this.rightPointer = null;
        }
    }


    @Override
    public int getRootElement() {
        return rootElement.value;
    }

    @Override
    public int getNumberOfElements() {
        return getNumberOfElementsRecursion(rootElement);
    }

    @Override
    public void addElement(int element) {
        addElementRecursion(rootElement, element);
    }

    @Override
    public void addElements(int[] elements) {
        for (int element : elements) {
            addElementRecursion(rootElement, element);
        }
    }

    @Override
    public boolean findElement(int value) {
        return findElementRecursion(rootElement, value);
    }

    @Override
    public int getLeftChild(int element) throws ElementNotFoundException, ChildNotFoundException {
        if (findElement(element)) {
            return getLeftChildRecursion(rootElement, element);
        } else {
            throw new ElementNotFoundException("The Element does not exist");
        }
    }

    @Override
    public int getRightChild(int element) throws ElementNotFoundException, ChildNotFoundException {
        if (findElement(element)) {
            return getRightChildRecursion(rootElement, element);
        } else {
            throw new ElementNotFoundException("The Element does not exist");
        }
    }

    @Override
    public int[] getSortedTreeAsc() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList = getSortedTreeAscRecursion(rootElement, arrayList);
        int[] array = new int[getNumberOfElements()];
        for (int i = 0; i < array.length; i++) {
            array[i] = arrayList.get(i);
        }
        return array;
    }

    @Override
    public int[] sortArray(int[] arrayToSort) {
        if (arrayToSort == null){
            return null;
        }
        Node rootNode = new Node(arrayToSort[0]);
        BinaryTreeImpl binaryTree = new BinaryTreeImpl(rootNode);
        int[] arrayCopy = new int[arrayToSort.length-1];
        System.arraycopy(arrayToSort, 1,arrayCopy,0,arrayCopy.length);
        binaryTree.addElements(arrayCopy);
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList = binaryTree.getSortedTreeAscRecursion(rootNode, arrayList);
        for (int i = 0; i < arrayCopy.length; i++) {
            arrayToSort[i] = arrayList.get(i);
        }
        return arrayToSort;
    }

    @Override
    public int[] getSortedTreeDesc() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList=getSortedTreeDescRecursion(rootElement, arrayList);
        int[] array = new int[getNumberOfElements()];
        for (int i = 0; i < array.length; i++) {
            array[i] = arrayList.get(i);
        }
        return array;
    }

    public int getNumberOfElementsRecursion(Node currentNode) {

        if (Objects.isNull(currentNode)) {
            return 0;
        }
        int count = 0;
        count++;

        count += getNumberOfElementsRecursion(currentNode.leftPointer) + getNumberOfElementsRecursion(currentNode.rightPointer);

        return count;
    }

    public void addElementRecursion(Node currentNode, int element) {
        if (element < currentNode.value) {
            if (Objects.isNull(currentNode.leftPointer)) {
                currentNode.leftPointer = new Node(element);
            } else {
                addElementRecursion(currentNode.leftPointer, element);
            }
        } else if (element > currentNode.value) {
            if (Objects.isNull(currentNode.rightPointer)) {
                currentNode.rightPointer = new Node(element);
            } else {
                addElementRecursion(currentNode.rightPointer, element);
            }
        }
    }

    public boolean findElementRecursion(Node currentNode, int value) {
        if (value == currentNode.value) {
            return true;
        } else if (value < currentNode.value && currentNode.leftPointer != null) {
            return findElementRecursion(currentNode.leftPointer, value);
        } else if (value > currentNode.value && currentNode.rightPointer != null) {
            return findElementRecursion(currentNode.rightPointer, value);
        }
        return false;
    }

    public int getLeftChildRecursion(Node currentNode, int value) throws ChildNotFoundException {
        if (value == currentNode.value) {
            if (currentNode.leftPointer == null) {
                throw new ChildNotFoundException("Left Child was not found");
            } else {
                return currentNode.leftPointer.value;
            }
        } else if (value < currentNode.value) {
            getLeftChildRecursion(currentNode.leftPointer, value);
        } else if (value > currentNode.value) {
            getLeftChildRecursion(currentNode.rightPointer, value);
        }
        return currentNode.leftPointer.value;
    }

    public int getRightChildRecursion(Node currentNode, int value) throws ChildNotFoundException {
        if (value == currentNode.value) {
            if (currentNode.rightPointer == null) {
                throw new ChildNotFoundException("Right Child was not found");
            } else {
                return currentNode.rightPointer.value;
            }
        } else if (value < currentNode.value) {
            getRightChildRecursion(currentNode.leftPointer, value);
        } else if (value > currentNode.value) {
            getRightChildRecursion(currentNode.rightPointer, value);
        }
        return currentNode.rightPointer.value;
    }

    public ArrayList<Integer> getSortedTreeAscRecursion(Node currentNode, ArrayList<Integer> array) {
        if (currentNode != null) {
            getSortedTreeAscRecursion(currentNode.leftPointer, array);
            array.add(currentNode.value);
            getSortedTreeAscRecursion(currentNode.rightPointer, array);
        } else {
            return null;
        }
        return array;
    }

    public ArrayList<Integer> getSortedTreeDescRecursion(Node currentNode, ArrayList<Integer> array) {
        if (currentNode != null) {
            getSortedTreeDescRecursion(currentNode.rightPointer, array);
            array.add(currentNode.value);
            getSortedTreeDescRecursion(currentNode.leftPointer, array);
        }
        return array;
    }

}




