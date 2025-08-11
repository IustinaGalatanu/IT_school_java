package org.example.Homework.session20;

import java.util.Arrays;

//Create a stream of integers from an array and find the sum of all integers using the reduce method. (Input: Integer[] numbers= {1, 2, 3, 4, 5};)
public class Sum {
    public static void main(String[] args) {
        Integer[] numbers= {1, 2, 3, 4, 5};
        int sum= Arrays.stream(numbers)
                .reduce(0,Integer::sum);

        System.out.println(sum);

    }
}
