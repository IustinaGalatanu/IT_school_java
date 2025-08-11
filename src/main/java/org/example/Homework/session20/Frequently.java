package org.example.Homework.session20;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Given a list of sentences, use flatMap to create a list of all words in all the sentences, and then find the most frequently occurring word. (Input: List<String> sentences = Arrays.asList("Hello World", "Hello Everyone", "Welcome to the World of Java");)
public class Frequently {
    public static void main(String[] args) {
        List<String> sentences = Arrays.asList("Hello World", "Hello Everyone", "Welcome to the World of Java");
        String frequently= sentences.stream()
                .map(String::toLowerCase)
                .flatMap(cuv->Arrays.stream(cuv.split(" ")))
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);
        System.out.println(frequently);



    }
}
