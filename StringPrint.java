package com.lemon.day07;

import java.util.ArrayList;

public class StringPrint {
    public static void main(String[] args) {
        String s = "abc,123,中国,llllll,haha";
        String[] list = s.split(",");
        for(int i=0;i<list.length;i++){
            System.out.println(list[i] + ":" + list[i].length());
        }
    }
}
