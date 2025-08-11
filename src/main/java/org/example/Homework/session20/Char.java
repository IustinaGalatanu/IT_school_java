package org.example.Homework.session20;

import java.util.Arrays;
import java.util.List;

//Using streams, find the total number of characters across a list of strings excluding whitespace characters. (Input: List<String> strings = Arrays.asList("Java Streams", "Method References", "Lambda Expressions");)
public class Char {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Java Streams", "Method References", "Lambda Expressions");
        long numberOfChar=strings.stream()
                .flatMapToInt(str -> str.chars())
                .filter(ch -> !Character.isWhitespace(ch))
                .count();

        System.out.println(numberOfChar);

    }
}
