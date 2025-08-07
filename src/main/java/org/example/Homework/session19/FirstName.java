package org.example.Homework.session19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Create a functional interface with a method that takes a List<String> representing first names and returns a List<String> of those names formatted in uppercase. Implement it using a lambda expression
public class FirstName {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("Iustina","Andreea","Ion");
        Strings str=(name)->{
            List<String> numeUpperCase=new ArrayList<>();
            for(String n:name){
                numeUpperCase.add(n.toUpperCase());
            }
            return numeUpperCase;
        };
        List<String> upperNames=str.nume(names);
        System.out.println(upperNames);


    }
}
@FunctionalInterface
interface Strings{
    List<String> nume(List<String>n);
}