package org.example.Homework.session19;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

//Create a functional interface that takes a list of integers and returns a list of integers. Use a lambda expression to implement this interface, such that it returns a list containing only the odd numbers from the original list.
public class Odd {
    public static void main(String[] args) {
        List<Integer> number= Arrays.asList(1,2,3,4,5,6);
        OddNumbers odds= (lista) -> lista.stream()
                .filter(n -> n % 2 != 0)
                .collect(Collectors.toList());

        List<Integer> impare = odds.numOdd(number);

        System.out.print("Numere impare: "+impare);
    }
}
@FunctionalInterface
interface OddNumbers{
    List<Integer>numOdd(List<Integer>num);
}
