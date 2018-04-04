package com.m3c.an.models;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class NodeTest {

    @Test
    public void testNodeInstance()
    {
        Node node = new Node(3);// Can create a node
        Assert.assertTrue(node instanceof Node);
    }
    @Test
    public void testNodeValue()
    {
        Node node = new Node(1);
        Assert.assertEquals(1,node.getValue());
    }
}