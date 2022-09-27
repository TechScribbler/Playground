package com.techscribbler;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuplicateCharacterAndCountInStringTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void find() {
        DuplicateCharacterAndCountInString duplicate = new DuplicateCharacterAndCountInString();
        duplicate.find("Aas");
    }
}