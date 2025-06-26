package com.classes;

import java.util.*;

public class BasicHashMap{
    public static void main(String args[]){

        //create map object
        Map<String, String> mp = new HashMap<>();

        //put keys and values in map
        mp.put("yashwalke@gmail.com","Yash@123");
        mp.put("yashwalke@gmail.com","Yash@6503");
        mp.put("viratkohli@gmail.com","Virat@123");

        //fetch using tostring
        System.out.println("Fetching Map keys and values using ToString");
        System.out.println(mp);

        //fetch using forEach
        System.out.println("\nFetching Map keys and values using ForEach");
        mp.forEach((k,v) ->{
            System.out.println("Key = "+k+" Value = "+v);
        });

        //check key available or not
        System.out.println("\nIs yashwalke@gmail.com available or not: "+mp.containsKey("yashwalke@gmail.com"));
        System.out.println("Is rohitsharma@gmail.com available or not: "+mp.containsKey("rohitsharma@gmail.com"));

        //size of map
        System.out.println("\nSize of Map is : "+mp.size());

        //check map is empty or not.
        System.out.println("\nIs Map is empty or not: "+mp.isEmpty());

        //key set
        System.out.println("\nAll Key set: \n"+mp.keySet());

        //hashcode of map
        System.out.println("\nHashCode of Map : "+mp.hashCode());

        //remove element and print map
        mp.remove("viratkohli@gmail.com");
        System.out.println("\nAfter removing viratkohli@gmail.com Map is: \n"+mp);

        //add multiple key and values to map using of() method.
        Map<String, String> map = Map.of("rohitsharma@gmail.com","Rohit@264","akshaykumar@gmail.com","Akshay@786","salmankhan@gmail.com","Sallu@11");

        //merge new map to old map
        mp.putAll(map);

        //fetch all map using for loop
        System.out.println("\nAfter adding multiple elements to map: ");
        /*  for(String key: mp.keySet()){
            System.out.println("Key : "+key);
        }
        for(String value: map.values()){
            System.out.println("Value : "+value);
        }
        */
        //fetching map keys and values using Entry i.e entrySet
        for(Map.Entry<String,String> entry : mp.entrySet()){
            System.out.println("Key = "+entry.getKey()+", Value = "+entry.getValue());
        }

    }
}