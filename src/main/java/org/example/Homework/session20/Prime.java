package org.example.Homework.session20;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//Create a stream of numbers from 1 to 100 and use the filter operation to retain only those numbers which are prime.
public class Prime {
    public static void main(String[] args) {
        List<Integer> numbers=new ArrayList<>();
        for(int i=1;i<=100;i++){
            numbers.add(i);
        }
        List<Integer> prime=numbers.stream()
                .filter(n -> n >= 2)  // 0 și 1 nu sunt prime
                .filter(n -> IntStream.rangeClosed(2, (int) Math.sqrt(n))
                        .allMatch(div -> n % div != 0))
                .collect(Collectors.toList());
        System.out.println(prime);
    }
}
