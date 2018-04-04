package com.m3c.an.models;

import com.m3c.an.controllers.ElementNotFoundException;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class BinaryTreeTest {

    @Test
    public void testRoot() {
        BTree bTree = new BTree(2);
        Assert.assertEquals(bTree.getRootElement(), 2);
    }
    
    @Test
    public void testAddElement() {
        BTree bTree = new BTree(5);
        bTree.addElement(7);
        Assert.assertEquals(7, bTree.getRoot().getRight().getValue());
    }

    @Test
    public void testAddElements() {
        BTree bTree = new BTree(5);
        int[] array = {7,4};
        bTree.addElements(array);
        Assert.assertEquals(7, bTree.getRoot().getRight().getValue());
        Assert.assertEquals(4, bTree.getRoot().getLeft().getValue());
    }

    @Test
    public void testGetNumberOfElements() {
        BTree bTree = new BTree(7);
        int[] array = {1, 3, 4, 8, 10, 11};
        bTree.addElements(array);
        Assert.assertEquals(7,bTree.getNumberOfElements());
    }

    @Test
    public void testFindElement() {
        BTree bTree = new BTree(5);
        int[] array = {1, 3, 4, 8, 10, 11};
        bTree.addElements(array);
        Assert.assertEquals(true, bTree.findElement(3));
    }

    @Test
    public void testGetRightChild() throws ElementNotFoundException {
        BTree bTree = new BTree(5);
        int[] array = {1, 3, 4, 8, 10, 11};
        bTree.addElements(array);
        Assert.assertEquals(8, bTree.getRightChild(5));
    }
    @Test
    public void testGetLeftChild() throws ElementNotFoundException {
        BTree bTree = new BTree(5);
        int[] array = {1, 3, 4, 8, 10, 11};
        bTree.addElements(array);
        Assert.assertEquals(8, bTree.getLeftChild(5));
    }
    @Test
    public void testGetMinimum() {
        BTree bTree = new BTree(5);
        int[] array = {1, 3, 4, 8, 10, 11};
        bTree.addElements(array);
        Assert.assertEquals(1, bTree.getMinimum());
    }
    @Test
    public void testGetMaximum() {
        BTree bTree = new BTree(5);
        int[] array = {1, 3, 4, 8, 10, 11};
        bTree.addElements(array);
        Assert.assertEquals(11, bTree.getMaximum());
    }
    @Test
    public void TestGetSortedTreeAsc() {
        BTree bTree = new BTree(5);
        int[] array = {11, 3, 8, 4, 10, 7, 15};
        int[] arraySorted = {3, 4, 7, 8, 10, 11, 15};
        bTree.addElements(array);
        Assert.assertEquals(arraySorted, bTree.getSortedTreeAsc());
    }
}