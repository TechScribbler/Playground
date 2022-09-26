package com.techscribbler;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanToIntegerTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void romanToInt() {
        RomanToInteger roman = new RomanToInteger();
        assertTrue(roman.romanToInt("III")==3);
        assertTrue(roman.romanToInt("MIX")==1009);
        assertTrue(roman.romanToInt("XL")==40);
    }
}