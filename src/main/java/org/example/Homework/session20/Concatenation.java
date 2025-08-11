package org.example.Homework.session20;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Given a list of strings, use streams to create a single string which is a concatenation of all strings separated by a comma. (Input: List<String> strings = Arrays.asList("one", "two", "three", "four");)
public class Concatenation {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("one", "two", "three", "four");
        String concat=strings.stream()
                .collect(Collectors.joining(","));
        System.out.println(concat);

    }
}
