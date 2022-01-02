package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] data = {5, 4, 3, 2};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas513Then7() {
        int[] data = {5, 4, 3, 2, 13, 22, 11, 513};
        int el = 513;
        int result = FindLoop.indexOf(data, el);
        int expected = 7;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas13Then4() {
        int[] data = {5, 4, 3, 2, 13, 22, 11, 513};
        int el = 13;
        int result = FindLoop.indexOf(data, el);
        int expected = 5;
        Assert.assertEquals(expected, result);
    }
}