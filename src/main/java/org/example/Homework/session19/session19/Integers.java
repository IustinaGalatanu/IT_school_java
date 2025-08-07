package org.example.Homework.session19.session19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

//Create a functional interface that takes a List<Integer> and a function that takes an integer as input and returns an integer. Implement this interface using a lambda expression to apply the function to each element in the list, returning a new list with the mapped values.
public class Integers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        ListMapper mapper = (list, func) -> {
            List<Integer> result = new ArrayList<>();
            for (int i : list) {
                result.add(func.apply(i));
            }
            return result;
        };

        List<Integer> doubled = mapper.mapList(numbers, n -> n * 2);

        System.out.println(doubled);
    }
}

@FunctionalInterface
interface ListMapper {
    List<Integer> mapList(List<Integer> list, Function<Integer, Integer> func);
}