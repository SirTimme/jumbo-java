package dev.sirtimme.subtracter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubtracterTest {
    private final Subtracter subtracter = new Subtracter();

    @Test
    void testSubtract() {
        assertEquals(40, subtracter.subtract(50, 10));
    }
}