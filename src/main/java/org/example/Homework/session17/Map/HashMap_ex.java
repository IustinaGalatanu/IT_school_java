package org.example.Homework.session17.Map;

import java.util.HashMap;
import java.util.Map;

//1.Write a Java program to associate the specified value with the specified key in a HashMap.
// 2.Write a Java program to count the number of key-value (size) mappings in a map.
// 3.Write a Java program to copy all of the mappings from the specified map to another map.
// 4.Write a Java program to remove all of the mappings from a map.
// 5.Write a Java program to check whether a map contains key-value mappings (empty) or not.
// 6.Write a Java program to get a shallow copy of a HashMap instance.
// 7.Write a Java program to test if a map contains a mapping for the specified key.
// 8.Write a Java program to test if a map contains a mapping for the specified value.
// 9.Write a Java program to create a set view of the mappings contained in a map.
// 10.Write a Java program to get the value of a specified key in a map.
// 11.Write a Java program to get a set view of the keys contained in this map.
// 12.Write a Java program to get a collection view of the values contained in this map.
public class HashMap_ex {
    public static void main(String[] args) {
        HashMap<String, Integer> ages = new HashMap<>();
        //1
        ages.put("Iustina", 24);
        ages.put("Andreea", 30);
        ages.put("Ionela", 22);
        System.out.println(ages);
        System.out.println();
        //2
        System.out.println(ages.size());
        System.out.println();
        //3
        HashMap<String, Integer> newAges = new HashMap<>();
        newAges.putAll(ages);
        System.out.println(newAges);
        //4
        newAges.clear();
        System.out.println(newAges);
        System.out.println();
        //5
        System.out.println(newAges.isEmpty());
        System.out.println();
        //6
        HashMap<String, Integer> copy = new HashMap<>(ages);
        System.out.println(copy);
        System.out.println();
        //7
        System.out.println(copy.containsKey("Iustina"));
        System.out.println();
        //8
        System.out.println(copy.containsValue(22));
        System.out.println();
        //9
        for(Map.Entry<String,Integer> entry:ages.entrySet()){
            System.out.println(entry.getKey()+" are varsta "+ entry.getValue());
        }
        System.out.println();
        //10
        System.out.println(ages.get("Iustina"));
        System.out.println();
        //11
        System.out.println(ages.keySet());
        System.out.println();
        //12
        System.out.println(ages.values());
        System.out.println();


    }
}
