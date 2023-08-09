package com.github.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author xtofer
 * @version 1.0.0
 * @date 10/21/19 9:05 AM
 */
public class DashaMapTest {
    @Test
    public void isEmpty() {
        //Given
        DashaMap amap = new DashaMapOne();
        //When
        boolean actual = amap.isEmpty();
        //Then
        Assert.assertEquals(true, actual);
    }

    @Test
    public void isNotEmpty() {
        //Given
        DashaMap amap = new DashaMapOne();
        amap.set("ayeeeeee", 1);
        //When
        boolean actual = amap.isEmpty();
        //Then
        Assert.assertEquals(false, actual);
    }

    @Test
    public void sizeEmptyTest() {
        //Given
        long expected = 0;
        DashaMap amap = new DashaMapOne();
        //When
        long actual = amap.size();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sizeTest() {
        //Given
        long expected = 1;
        DashaMap amap = new DashaMapOne();
        amap.set("ayeeeeee", 1);
        //When
        long actual = amap.size();
        //Then
        Assert.assertEquals(expected, actual);
    }
}

