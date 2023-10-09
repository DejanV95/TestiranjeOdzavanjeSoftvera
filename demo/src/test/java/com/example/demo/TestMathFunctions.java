package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestMathFunctions {

    @Test
    public void testAdd() {
        MathFunctions math = new MathFunctions();
        assertEquals(5, math.add(2, 3));
        assertEquals(0, math.add(-1, 1));
        assertEquals(0, math.add(0, 0));
    }

    @Test
    public void testSubtract() {
        MathFunctions math = new MathFunctions();
        assertEquals(2, math.subtract(5, 3));
        assertEquals(0, math.subtract(1, 1));
        assertEquals(0, math.subtract(0, 0));
    }
}