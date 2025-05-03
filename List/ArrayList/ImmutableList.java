// Program to create Immutable(unchanged) List

package com.classes;

import java.util.*;

public class ImmutableList{
    public static void main(String ...args){
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);

        /*
            Here, we can't perform any operation on List because it
            is immutable list.
            If we try to perform operation then we will get java.lang.UnsupportedOperationException
        */
        try{
            System.out.println("List : "+list);
            list.add(20);       //java.lang.UnsupportedOperationException
            list.remove(5);     //java.lang.UnsupportedOperationException
            list.set(0,10);     //java.lang.UnsupportedOperationException
            System.out.println("List : "+list);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

/* Output:
List : [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
java.lang.UnsupportedOperationException
        at java.base/java.util.ImmutableCollections.uoe(ImmutableCollections.java:142)
        at java.base/java.util.ImmutableCollections$AbstractImmutableCollection.add(ImmutableCollections.java:147)
        at com.classes.ImmutableList.main(ImmutableList.java:13)
        at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
        at java.base/java.lang.reflect.Method.invoke(Method.java:580)
        at jdk.compiler/com.sun.tools.javac.launcher.Main.execute(Main.java:484)
        at jdk.compiler/com.sun.tools.javac.launcher.Main.run(Main.java:208)
        at jdk.compiler/com.sun.tools.javac.launcher.Main.main(Main.java:135)
*/