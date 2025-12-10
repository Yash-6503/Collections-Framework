// package com.classes;

import java.util.HashMap;
import java.util.Map;

public class BasicMap {
    public static void main(String... args) {

        Map<Integer, String> map = new HashMap<>(Map.of(101, "Shubham", 102, "Anil"));
        
        System.out.println(map.put(103, "Azam"));
        System.out.println(map);
    }
}
