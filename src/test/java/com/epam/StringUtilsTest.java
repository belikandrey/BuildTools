package com.epam;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {
    private StringUtils stringUtils;
    private static final String POSITIVE_NUMBER = "65";

    @BeforeEach
    public void initUtils(){
        stringUtils = new StringUtils();
    }

    @Test
    public void rightEqualsNumbersTest(){
        assertTrue(stringUtils.isPositiveNumber(POSITIVE_NUMBER));
    }
}
