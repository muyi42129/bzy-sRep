package com.lrn;

import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        String[] arr = new String[5];
        arr[0] = "by";
        int length = arr.length;
        Map ma = new HashMap<String,Object>();
        ma.put("Str","123");
        System.out.println(length);
        System.out.println(arr[3]+"-"+arr[0]);
    }
}
