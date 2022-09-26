package com.techscribbler;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegerToRomanTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void intToRoman() {

            IntegerToRoman integerToRoman=new IntegerToRoman();
            assertTrue(integerToRoman.intToRoman(918).equalsIgnoreCase("CMXVIII"));
        }

}