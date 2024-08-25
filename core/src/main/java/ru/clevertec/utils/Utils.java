package ru.clevertec.utils;

import ru.clevertec.utils.StringUtils;

import java.util.Arrays;

public class Utils {
    public static boolean isAllPositiveNumber(String... str){
        if(str.length >0){
            return Arrays.stream(str).allMatch(s->StringUtils.isPositiveNumber(s));
        }
        return false;
    }
}
