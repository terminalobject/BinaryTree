package com.m3c.an;

import com.m3c.an.controllers.ElementNotFoundException;

import java.util.List;

/**
 * Created by keith.dauris on 26/06/2017.
 */
public interface BinaryTree {
    int getRootElement();

    int getNumberOfElements();

    void addElement(int element);

    void addElements(int[] elements);

    boolean findElement(int value);

    int getLeftChild(int element) throws ElementNotFoundException;

    int getRightChild(int element) throws ElementNotFoundException;

    List<Integer> getSortedTreeAsc();

    List<Integer> getSortedTreeDesc();
}
