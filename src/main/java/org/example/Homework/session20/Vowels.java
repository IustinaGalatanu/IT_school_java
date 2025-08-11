package org.example.Homework.session20;

import java.util.Arrays;
import java.util.Set;

//Given a string, use streams to count the number of vowels in it. (Input: String sentence = "Hello World";)
public class Vowels {
    public static void main(String[] args) {
        String sentence = "Hello World";
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
        long numberOfVowels= sentence.toLowerCase()
                .chars()
                .filter(ch -> vowels.contains((char)ch))
                .count();

        System.out.println(numberOfVowels);


    }
}
