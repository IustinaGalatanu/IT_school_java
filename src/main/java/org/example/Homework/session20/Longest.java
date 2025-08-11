package org.example.Homework.session20;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//Using a list of strings, find and print the longest string using Java streams. (Input: List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");)
public class Longest {
    public static void main(String[] args) {
         List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
         String longest=strings.stream()
                 .max(Comparator.comparingInt(String::length))
                 .orElse(null);
        System.out.println(longest);

    }
}
