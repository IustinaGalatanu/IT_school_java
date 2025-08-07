package org.example.Homework.session19;
//Create a functional interface that takes a single double as a parameter and returns a double. Implement it using a lambda expression to create a utility that returns the square root of the input value.
public class SquareRoot {
    public static void main(String[] args) {
        Square sq=n->Math.sqrt(n);
        System.out.println(sq.radical(49.0));
    }
}
@FunctionalInterface
interface Square{
    double radical(double a);
}
