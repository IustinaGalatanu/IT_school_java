package org.example.Homework.session19;

import java.util.Arrays;
import java.util.List;

//Create a functional interface that takes a list of integers and returns the maximum value from the list. Implement this interface using a lambda expression. Ensure your lambda correctly handles an empty list case.
public class Maxim {
    public static void main(String[] args) {

        List<Integer> num= List.of(2,4,9,13,55,3);
        Max max=(numbers)->{
            int maxim =0;
            for(int n:numbers){
                if(n> maxim){
                    maxim =n;
                }
            }
            return maxim;
        };

        int maximul=max.max(num);
        System.out.println(maximul);


    }
}
@FunctionalInterface
interface Max{
    int max(List<Integer>num);
}