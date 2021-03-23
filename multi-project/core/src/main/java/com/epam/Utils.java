package com.epam;

public class Utils {
    public static boolean isAllPositiveNumbers(String... str){
        StringUtils stringUtils = new StringUtils();
        for(String numStr : str){
            if(!stringUtils.isPositiveNumber(numStr)){
                return false;
            }
        }
        return true;
    }
}
