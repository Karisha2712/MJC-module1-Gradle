package com.epam.labs.util;

import org.apache.commons.lang3.math.NumberUtils;

public final class StringUtils {
    private StringUtils() {

    }

    public static boolean isPositiveNumber(String str) {
        return NumberUtils.isCreatable(str) && Integer.parseInt(str) > 0;
    }
}
