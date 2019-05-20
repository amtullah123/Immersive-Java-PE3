package com.stackroute.pe3;
import java.util.Arrays;
import java.util.List;
public class Vowels {
    public String[] getVowels(String[] str) {
        // String str[] = {"India", "Egypt", "America", "Indonesia"};
        for (int i = 0; i < str.length; i++) {
            String s = str[i].substring(1);
            //it replaces the vowels with space
            s = s.replaceAll("[aeiou]", "");
            str[i] = str[i].substring(0, 1) + s;
        }
        return str;
    }
}