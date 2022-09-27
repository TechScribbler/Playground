package com.techscribbler;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JumpAcrossArrayOfIntegerTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void jump() {
        JumpAcrossArrayOfInteger jump=new JumpAcrossArrayOfInteger();
        assertTrue(jump.jump(new Integer[]{1,2,4,1,5,2,3,5,6,0,3,3,4}));
    }
}