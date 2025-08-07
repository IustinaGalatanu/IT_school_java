package org.example.Homework.session19;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

//Create a functional interface named ListFilter that works with generics. It should have a method that takes a list of elements of type T and a predicate functional interface, applying the predicate to filter elements of the list, returning a new list with elements that satisfy the predicate condition. Implement the ListFilter using a lambda expression and demonstrate its usage with different types of lists and predicates.
public class Filter {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        Predicate<Integer> isEven = n -> n % 2 == 0;
        ListFilter <Integer> filter1=(list1,predicate1)->list1.stream()
                .filter(predicate1)
                .collect(Collectors.toList());
        List<Integer> evens = filter1.filter(numbers, isEven);
        System.out.println("Even numbers: " + evens);

    }
}
@FunctionalInterface
interface ListFilter<T> {
    List<T> filter(List<T> list, Predicate<T> predicate);
}