package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculationTest {

    @BeforeEach
    void setUp() {

    }

    @Test
    void testFindMax() {
        assertEquals(4,Calculation.findMax(new Integer[]{1, 3, 4, 2}) );
        assertEquals(-1, Calculation.findMax(new Integer[] {-12, -1, -3, -4, -2}));
    }

    @Test
    void testCube(){
        assertEquals(27, Calculation.cube(3));
    }
}