package org.example.Homework.session19.session19;

//Create a functional interface that takes a string and an integer n as parameters and returns a string. Implement it using a lambda expression that returns the first n characters of the string. If n is larger than the length of the string, it should return the full string.
public class Char {
    public static void main(String[] args) {

        SubString substring=(s1,n)->{
            if (n >= s1.length()) {
                return s1;
            } else {
                return s1.substring(0, n);
            }
        };
        System.out.println(substring.getSubstring("Abecedar",3));

    }
}
@FunctionalInterface
interface SubString{
    String getSubstring(String a, int n);
}
