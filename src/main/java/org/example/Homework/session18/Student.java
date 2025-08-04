package org.example.Homework.session18;

import java.util.Objects;

//Create a Student class with name, age, studentId, and email fields. Implement the equals() method to check all fields except the studentId. Implement the hashCode() method to use all fields except the student Id to calculate the hash code. Test that two instances with the same name, age, and email return true for equals() and have the same hash code.
public class Student {
    private String name;
    private int age;
    private String studentId;
    private String email;

    public Student(String name, int age, String studentId, String email) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name) && Objects.equals(email, student.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, email);
    }
}
class Students{
    public static void main(String[] args) {

        Student s1=new Student("Iustina",24,"123","iustina@gmail.com");
        Student s2=new Student("Iustina",24,"345","iustina@gmail.com");

        System.out.println("s1 equals s2 " + s1.equals(s2));

        System.out.println("hashCode s1: " + s1.hashCode());
        System.out.println("hashCode s2: " + s2.hashCode());


    }
}