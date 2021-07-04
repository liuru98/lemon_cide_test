package com.lemon.day07;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put("id","1") ;
        hashMap.put("mobile_phone","13212312312") ;
        hashMap.put("pwd","12312312") ;

        if(hashMap.containsKey("mobile_phone")){
            System.out.println(hashMap.get("mobile_phone"));
        }
        else {System.out.println("不存在该值");}

        hashMap.replace("pwd","12312312","88888888");
        System.out.println(hashMap.get("pwd"));
    }
}
