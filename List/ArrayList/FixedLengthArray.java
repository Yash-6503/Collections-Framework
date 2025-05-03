// Program to create a fixed length array.

package com.classes;

import java.util.*;

public class FixedLengthArray{
    public static void main(String args[]){
        List<Integer> list = Arrays.asList(
            100,200,300,400,500
        );

        /*
            If we create a fixed length array using Arrays.asList() static method
            then we can't perform any operation on it.
            It will give java.lang.UnsupportedOperationException
        */
        try{
            System.out.println("List : "+list);
            // list.add(1000);     //java.lang.UnsupportedOperationException
            // list.remove(300);    //java.lang.UnsupportedOperationException
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

/*
List : [100, 200, 300, 400, 500]
java.lang.UnsupportedOperationException
        at java.base/java.util.AbstractList.remove(AbstractList.java:169)
        at com.classes.FixedLengthArray.main(FixedLengthArray.java:16)
        at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
        at java.base/java.lang.reflect.Method.invoke(Method.java:580)
        at jdk.compiler/com.sun.tools.javac.launcher.Main.execute(Main.java:484)
        at jdk.compiler/com.sun.tools.javac.launcher.Main.run(Main.java:208)
        at jdk.compiler/com.sun.tools.javac.launcher.Main.main(Main.java:135)
*/