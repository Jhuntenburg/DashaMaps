package com.github.zipcodewilmington.MyLinkedList;

import org.junit.Assert;
import org.junit.Test;

public class MyNodeTest {
    @Test
    public void setNextTest() {
        //Given
        MyNode first = new MyNode("dolio", 1);
        MyNode second = new MyNode("kris", 3);
        //When
        first.setNext(second);
        //Then
        Assert.assertEquals(second, first.getNext());
    }

    @Test
    public void equalsTest() {
        //Given
        MyNode node1 = new MyNode("joe", 10);
        MyNode node2 = new MyNode("joe", 10);
        //When and Then
        Assert.assertEquals(node1, node2);
    }
}