package org.example.Homework.session19;

import java.util.Arrays;
import java.util.List;

//Write a program that uses lambda expressions to calculate the sum of all the elements in a list of integers.
public class Sum {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(1,2,3,4,5);

        CalcSum calcSum=(num)->{
            int sum=0;
            for(int n:num){
                sum+=n;
            }
            return sum;
        };
        int sum=calcSum.sum(numbers);
        System.out.println(sum);



    }
}
@FunctionalInterface
interface CalcSum{
    int sum(List<Integer>numbers);
}
