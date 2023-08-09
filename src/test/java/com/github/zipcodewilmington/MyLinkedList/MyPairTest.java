package com.github.zipcodewilmington.MyLinkedList;

import org.junit.Assert;
import org.junit.Test;

public class MyPairTest {
    @Test
    public void testSetKey() {
        //Given
        String expectedKey = "pain";
        MyPair pair = new MyPair("no", 3);
        //When
        pair.setKey(expectedKey);
        //When
        String actualKey = pair.getKey();
        //Then
        Assert.assertEquals(expectedKey, actualKey);
    }

    @Test
    public void testSetValue() {
        //Given
        Integer expectedValue = 19;
        MyPair pair = new MyPair("no", 3);
        //When
        pair.setValue(expectedValue);
        //When
        Integer actualKey = pair.getValue();
        //Then
        Assert.assertEquals(expectedValue, actualKey);
    }

    @Test
    public void testEquals() {
        //Given
        MyPair mypair = new MyPair("no", 1);
        MyPair second = new MyPair("no", 1);
        //When and Then
        Assert.assertEquals(mypair, second);
    }
}
