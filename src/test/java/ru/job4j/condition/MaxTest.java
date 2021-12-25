package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax50to3then50() {
        int left = 50;
        int right = 3;
        int result = Max.max(left, right);
        int expected = 50;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax77to77then77() {
        int left = 77;
        int right = 77;
        int result = Max.max(left, right);
        int expected = 77;
        Assert.assertEquals(result, expected);
    }
}