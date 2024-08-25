package ru.clevertec.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {

    @Test
    void isAllPositiveNumber() {
        Assertions.assertFalse(Utils.isAllPositiveNumber("12", "79", "qweqew"));
    }

    @Test
    void isAllPositiveNumberValidParameters() {
        Assertions.assertTrue(Utils.isAllPositiveNumber("12", "7.9"));
    }
}