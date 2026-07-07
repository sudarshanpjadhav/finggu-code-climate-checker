package com.finggu.codeclimatechecker.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FingguUtil {

    public static boolean isValidJavaCode(String code) {
        Pattern pattern = Pattern.compile("public class\s+\w+\s*\{\s*\}");
        Matcher matcher = pattern.matcher(code);

        return matcher.find();
    }

}