package org.example.Homework.session19;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//Write a program that uses lambda expressions to sort a list of strings in alphabetical order.
public class Alph {
    public static void main(String[] args) {

        List<String> nume= Arrays.asList("Ana", "George","Bianca", "Andrei");
        Comparator<String> alph=(n1,n2)->n1.compareTo(n2);
        nume.sort(alph);

        System.out.println("Numele in ordine alfabetica: "+nume);

    }
}
