package com.epam.lab.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StringUtilsTest {
    @Test
    void isIsPositiveNumberReturnFalse() {
        String parameter = "-54";
        boolean actual = StringUtils.isPositiveNumber(parameter);
        Assertions.assertFalse(actual);
    }
}
