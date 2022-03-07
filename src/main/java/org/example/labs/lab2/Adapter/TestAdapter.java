package org.example.labs.lab2.Adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestAdapter {
    @Test
    public void test() {
        RoundHole hole = new RoundHole(5);
        RoundStick roundStick = new RoundStick(5);
        assertTrue(hole.fits(roundStick));

        SquareStick smallSquareStick = new SquareStick(5);
        SquareStick largeSquareStick = new SquareStick(10);
        SquareStickAdapter smallSquareStickAdapter = new SquareStickAdapter(smallSquareStick);
        SquareStickAdapter largeSquareStickAdapter = new SquareStickAdapter(largeSquareStick);

        assertTrue(hole.fits(smallSquareStickAdapter));
        assertFalse(hole.fits(largeSquareStickAdapter));
    }
}
