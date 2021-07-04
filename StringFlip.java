package com.lemon.day07;

import java.util.Arrays;

public class StringFlip {
    public static void main(String[] args) {
        String s = "aiwozhonghua";
        char[] c = s.toCharArray();
        String result = "";
        for(int i =c.length-1;i>=0;i--){
            result += c[i];
        }
        System.out.println(result);
    }
}
