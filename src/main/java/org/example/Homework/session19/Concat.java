package org.example.Homework.session19;
//Create a functional interface with a method that takes two strings and returns a string. Implement this interface using a lambda expression to create a utility that joins two strings with a space in between.
public class Concat {
    public static void main(String[] args) {
        Concatenare numeComplet=(nume,prenume)-> new StringBuilder().append(nume).append(" ").append(prenume).toString();

        System.out.println(numeComplet.concat("Iustina","Galatanu"));

    }
}
@FunctionalInterface
interface Concatenare{
    String concat(String a, String b);
}
