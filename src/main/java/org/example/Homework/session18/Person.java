package org.example.Homework.session18;

import java.util.Objects;

//Create a Person class with name, age, and email fields. Implement the equals() method to check only the name and age fields. Implement the hashCode() method to use the name and age fields to calculate the hash code. Test that two instances with the same name and age return true for equals() and have the same hash code.
public class Person {
    private String name;
    private int age;
    private String email;

    Person(String name, int age, String email){
        this.name=name;
        this.age=age;
        this.email=email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
 class Persons {
     public static void main(String[] args) {

         Person p1=new Person("Iustina", 24,"iustina@gmail.com");
         Person p2= new Person("Iustina", 24,"iustinagalatanu@gmail.com");

         System.out.println("p1 equals p2 " + p1.equals(p2));

         System.out.println("hashCode p1: " + p1.hashCode());
         System.out.println("hashCode p2: " + p2.hashCode());

     }
 }
