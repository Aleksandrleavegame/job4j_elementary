package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenP6K2then2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP12K4then5dot76() {
        int p = 12;
        int k = 4;
        double expected = 5.76;
        double out = SqArea.square(p, k);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP8K1then4() {
        int expected = 4;
        int p = 8;
        int k = 1;
        double out = SqArea.square(p, k);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP9K2then4dot5() {
        double expected = 4.5;
        int p = 9;
        int k = 2;
        double out = SqArea.square(p, k);
        assertEquals(expected, out, 0.01);
    }
}