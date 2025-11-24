package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testSingleReplacement() {
        String result = Main.maximizeA("1111", "9");
        assertEquals("9111", result);
    }
}