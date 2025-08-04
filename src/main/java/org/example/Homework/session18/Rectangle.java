package org.example.Homework.session18;
//Implement the equals() and hashCode() methods for a Rectangle class with width and height fields. Test that two instances with the same width and height return true for equals() and have the same hash code.
import java.util.Objects;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height){
        this.width=width;
        this.height=height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return width == rectangle.width && height == rectangle.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height);
    }
}
class Rectangles{
    public static void main(String[] args) {

        Rectangle r1=new Rectangle(3,4);
        Rectangle r2=new Rectangle(3,4);

        System.out.println("r1 equals r2 " + r1.equals(r2));

        System.out.println("hashCode r1: " + r1.hashCode());
        System.out.println("hashCode r2: " + r2.hashCode());

    }
}
