package org.example.Homework.session20;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Given a list of people with attributes: first name, last name, and age; use streams to find all people who are older than 18 years.
//class Person {
//String firstName;
//String lastName;
//int age;
//}
//List<Person> people = Arrays.asList(new Person("Alice", "Johnson", 20), new Person("Bob", "Smith", 17));
public class People {
    public static void main(String[] args) {

        List<Person> people = Arrays.asList(new Person("Alice", "Johnson", 20), new Person("Bob", "Smith", 17));

        List<String> olderThan18= people.stream()
                .filter(person -> person.age>18)
                .map(Person::getFullName)
                .collect(Collectors.toList());

        System.out.println(olderThan18);


    }
}
class Person {
    String firstName;
    String lastName;
    int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFullName() {
        return firstName.concat(" ").concat(lastName);
    }
}