package org.example.Homework.session18;
//Create a method that returns a JSON representation of an object. The method should make use of the toString method to facilitate this.
public class JSON {
    private String nume;
    private String specializare;

    public JSON(String nume, String specializare) {
        this.nume = nume;
        this.specializare = specializare;
    }

    @Override
    public String toString() {
        return "{" +
                "\"nume\": \"" + nume + "\"," +
                "\"specializare\": \"" + specializare + "\"" +
                "}";
    }
}

class Doctors{
    public static void main(String[] args) {
        JSON j1=new JSON("Andrei Pop", "oftamolog");
        JSON j2= new JSON("Andreea Marin", "dermatolog");

        System.out.println(j1.toString());
        System.out.println(j2.toString());
    }
}
