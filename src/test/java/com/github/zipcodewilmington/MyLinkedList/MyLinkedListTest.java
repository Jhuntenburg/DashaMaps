package com.github.zipcodewilmington.MyLinkedList;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkedListTest {
    @Test
    public void addTest() {
        //Given
        MyLinkedList mll = new MyLinkedList("manny");
        String expectedKey = "brent";
        Integer expectedValue = 6;
        MyNode expected = new MyNode(expectedKey, expectedValue);
        //When
        mll.add(expectedKey, expectedValue);
        MyNode actual = mll.getHead().getNext();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sizeTest() {
        //Given
        int expected = 1;
        MyLinkedList mll = new MyLinkedList("manny");
        mll.add("brent", 6);
        //When
        int actual = mll.size();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getTest() {
        //Given
        MyLinkedList mll = new MyLinkedList("manny");
        String expectedKey = "brent";
        Integer expectedValue = 6;
        MyNode expected = new MyNode(expectedKey, expectedValue);
        mll.add(expectedKey, expectedValue);
        //When
        MyNode actual = mll.get(expectedKey);
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void remove() {
        //Given
        MyLinkedList mll = new MyLinkedList("manny");
        String expectedKey = "brent";
        Integer expectedValue = 6;
        mll.add(expectedKey, expectedValue);
        //When
        Integer actualValue = mll.remove(expectedKey);
        //Then
        Assert.assertEquals(expectedValue, actualValue);
        Assert.assertEquals(true, mll.isEmpty());
    }

    @Test
    public void isEmptyTest() {
        //Given
        MyLinkedList mll = new MyLinkedList("manny");
        //When
        boolean actual = mll.isEmpty();
        //Then
        Assert.assertEquals(true, actual);
    }
    @Test
    public void isNotEmptyTest() {
        //Given
        MyLinkedList mll = new MyLinkedList("manny");
        mll.add("brent", 6);
        //When
        boolean actual = mll.isEmpty();
        //Then
        Assert.assertEquals(false, actual);
    }
}
