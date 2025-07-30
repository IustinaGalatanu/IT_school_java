package org.example.Homework.session17.Map;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

//1.Write a Java program to associate the specified value with the specified key in a Tree Map.
//2.Write a Java program to copy a Tree Map content to another Tree Map.
//3.Write a Java program to search a key in a Tree Map.
//4.Write a Java program to search a value in a Tree Map.
//5.Write a Java program to get all keys from the given a Tree Map.
//6.Write a Java program to delete all elements from a given Tree Map.
//7.Write a Java program to sort keys in Tree Map by using comparator.
//8.Write a Java program to get a key-value mapping associated with the greatest key and the least key in a map.
//9.Write a Java program to get the first (lowest) key and the last (highest) key currently in a map.
//10.Write a Java program to get a reverse order view of the keys contained in a given map.
//11.Write a Java program to get a key-value mapping associated with the greatest key less than or equal to the given key.
//12.Write a Java program to get the greatest key less than or equal to the given key.
//13.Write a Java program to get the portion of a map whose keys are strictly less than a given key.
//14.Write a Java program to get the portion of this map whose keys are less than (or equal to, if inclusive is true) a given key.
//15.Write a Java program to get the least key strictly greater than the given key. Return null if there is no such key.
//16.Write a Java program to get a key-value mapping associated with the greatest key strictly less than the given key. Return null if there is no such key.
//17.Write a Java program to get the greatest key strictly less than the given key. Return null if there is no such key.
public class TreeMap_ex {
    public static void main(String[] args) {
        TreeMap<String, Integer> ages= new TreeMap<>();
        //1
        ages.put("Iustina", 24);
        ages.put("Andreea", 30);
        ages.put("Ionela", 22);
        System.out.println(ages);
        System.out.println();
        //2
        TreeMap<String, Integer> copy= new TreeMap<>(ages);
        System.out.println(copy);
        System.out.println();
        //3
        System.out.println(copy.containsKey("Iustina"));
        System.out.println();
        //4
        System.out.println(copy.containsValue(12));
        System.out.println();
        //5
        System.out.println(copy.keySet());
        System.out.println();
        //6
        copy.clear();
        System.out.println(copy);
        System.out.println();
        //7
        TreeMap<String, Integer> treeMap = new TreeMap<>(Comparator.reverseOrder());

        treeMap.put("Ion", 3);
        treeMap.put("Alex", 5);
        treeMap.put("Iustina", 24);

        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
        System.out.println();
        //8 si //9
        System.out.println(ages);
        System.out.println(ages.lastEntry().getKey());
        System.out.println(ages.firstEntry().getKey());
        System.out.println();
        //10
        System.out.println(ages.descendingKeySet());
        System.out.println();
        //11
        String searchKey = "Iustina";
        System.out.println(ages.floorEntry(searchKey));
        System.out.println();
        //12
        System.out.println(ages.floorEntry(searchKey).getKey());
        System.out.println();
        //13
        System.out.println(ages.headMap(searchKey).keySet());
        System.out.println();
        //14
        System.out.println(ages.headMap(searchKey,true).keySet());
        System.out.println();
        //15
        System.out.println(ages.higherKey(searchKey));
        System.out.println();
        //16
        System.out.println(ages.lowerEntry(searchKey));
        System.out.println();
        //17
        System.out.println(ages.lowerKey(searchKey));


    }
}
