package org.example.Homework.session17.Set;
//1.Write a Java program to append the specified element to the end of a hash set.
// 2.Write a Java program to iterate through all elements in a hash list.
// 3.Write a Java program to get the number of elements in a hash set.
// 4.Write a Java program to empty a hash set.
//5.Write a Java program to test a hash set is empty or not.
//6.Write a Java program to clone a hash set to another hash set.
//7.Write a Java program to convert a hash set to an array.
//8.Write a Java program to convert a hash set to a tree set.
//9.Write a Java program to convert a hash set to a List/ArrayList.
//10.Write a Java program to compare two hash set.
//11.Write a Java program to compare two sets and retain elements which are same on both sets.
//12.Write a Java program to remove all of the elements from a hash set.

import java.util.*;

public class HashSet_ex {
    public static void main(String[] args) {
        Set<String> names= new HashSet<>();
        //1
        names.add("Iustina");
        names.add("Andreea");
        names.add("Ionel");
        System.out.println(names);
        System.out.println();
        //2
        for( String name:names){
            System.out.println("Nume: "+name);
        }
        System.out.println();
        //3
        System.out.println(names.size());
        System.out.println();
        //4
        Set <String> namesCopy= new HashSet<>(names);
        namesCopy.clear();
        System.out.println(namesCopy);
        System.out.println();
        //5
        System.out.println(namesCopy.isEmpty());
        System.out.println();
        //6
        Set <String> clone= new HashSet<>(names);
        System.out.println(clone);
        System.out.println();
        //7
        String [] array= names.toArray(names.toArray(new String[0]));
        System.out.println(Arrays.toString(array));
        System.out.println();
        //8
        Set<String> treeSet = new TreeSet<>(names);
        System.out.println(treeSet);
        System.out.println();
        //9
        List<String> arrayList= new ArrayList<>(names);
        System.out.println(arrayList);
        System.out.println();
        //10
        for(String name:names){
            if(clone.contains(name)){
                System.out.println(name+ " se gaseste in ambele seturi");
            }else{
                System.out.println(" Nu se gaseste in ambele seturi");
            }
        }
        System.out.println();
        //11
        names.add("Andrei");
        System.out.println(names);
        names.retainAll(clone);
        System.out.println(names);
        System.out.println();
        //12
        clone.clear();
        System.out.println(clone);
    }
}
