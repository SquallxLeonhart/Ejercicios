package com.leon.cje1.test.braindumps.programmer;

import java.util.Arrays;

public class CheckClass {
    public static int checkValue(String s1, String s2) {
        return s1.length() - s2.length();
    }

    public static void main(String[] args) {
        String[] strArray = new String[] { "Tiger", "Rat", "Cat", "Lion" };
        // line n1
        Arrays.sort(strArray, CheckClass::checkValue);
//        Arrays.sort(strArray, (CheckClass::new)::checkValue);
//        Arrays.sort(strArray, (CheckClass::new).checkValue);
//        Arrays.sort(strArray, CheckClass::new::checkValue);
        
        for (String s : strArray) {
            System.out.print(s + " ");
        }
    }

}