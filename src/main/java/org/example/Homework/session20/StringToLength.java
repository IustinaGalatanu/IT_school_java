package org.example.Homework.session20;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Use streams to transform a list of strings into a list of their respective lengths. (Input: List<String> strings = Arrays.asList("Hello", "World", "Java", "Streams");)
public class StringToLength {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Hello", "World", "Java", "Streams");
        List<Integer> length=strings.stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println(length);

    }
}
