package com.epam.lab.number;


import com.epam.lab.util.StringUtils;

import java.util.Arrays;

public final class Utils {
    private Utils() {

    }

    public static boolean isAllPositiveNumbers(String... str) {
        return Arrays.stream(str).allMatch(StringUtils::isPositiveNumber);
    }
}
