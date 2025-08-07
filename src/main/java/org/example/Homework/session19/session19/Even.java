package org.example.Homework.session19.session19;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

//Write a program that uses lambda expressions to filter a list of integers and return only the even numbers.
public class Even {
    public static void main(String[] args) {

        List<Integer> numbers= Arrays.asList(1,2,3,4,5);
        Predicate<Integer> isEven = number -> number % 2 == 0;
        List<Integer> evens = numbers.stream()
                .filter(isEven)
                .collect(Collectors.toList());

        System.out.print("Numere pare: "+evens);
    }
}
