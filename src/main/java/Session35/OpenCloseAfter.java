package Session35;

public class OpenCloseAfter {
    public static void main(String[] args) {
        Shape circle = new CircleAfter(10.2);
        System.out.println("Circle : "+ circle.calculateArea());
        Shape rectangular = new RectangularAfter(12,34);
        System.out.println("Rectangular : "+ rectangular.calculateArea());
        Shape square = new SquareAfter(4);
        System.out.println("Square : "+ rectangular.calculateArea());
    }

}

interface Shape {
    double calculateArea ();
}

class CircleAfter implements Shape {
    double radius;

    public CircleAfter(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
class RectangularAfter implements Shape {
    double length, width;

    public RectangularAfter(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length*width;
    }
}

class SquareAfter implements Shape {
    double length;

    public SquareAfter(double length) {
        this.length = length;
    }

    @Override
    public double calculateArea() {
        return length*length;
    }
}