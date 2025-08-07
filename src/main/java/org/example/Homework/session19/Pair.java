package org.example.Homework.session19;

import java.util.AbstractMap;
import java.util.Map;

//Create a functional interface called PairMaker which takes two parameters of type T and U and returns a Pair object that holds both values. The Pair class should be a generic class that can hold two values of any types. Your task is to implement the PairMaker using a lambda expression to instantiate Pair objects with the given values.
public class Pair {
    public static void main(String[] args) {
        PairMaker pairs=(nume,varsta)->new AbstractMap.SimpleEntry(nume,varsta);
        System.out.println(pairs.make("Iustina",24));

    }
}
@FunctionalInterface
interface PairMaker<T, U> {
    Map.Entry<T, U> make(T first, U second);

}
