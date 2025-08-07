package org.example.Homework.session19;

import java.util.Arrays;
import java.util.List;

//Create a functional interface that is generic and takes a list of generic items and a single generic item, returning a boolean indicating whether the item is in the list. Implement this interface using a lambda expression.
public class Generic {
    public static void main(String[] args) {
        List<String> nume= Arrays.asList("Iustina","Andreea");
        Gen find=((list, value) -> list.contains(value));
        System.out.println(find.isInList(nume,"Iustina"));

    }
}
@FunctionalInterface
interface Gen<T>{
    boolean isInList(List<T> list, T value);
}