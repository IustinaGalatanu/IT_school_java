package Session35;

public class OpenCloseBefore {
}

class AreaCalculator {
    double calculateArea(Object o) {
        if (o instanceof Circle) {
            Circle circle = (Circle) o;
            return Math.PI * circle.radius * circle.radius;
        }
        if (o instanceof Rectangular) {
            Rectangular rectangular = (Rectangular) o;
            return rectangular.length * rectangular.width;
        }
        return 0;
    }
}
class Circle {
    double radius;

}
class Rectangular {
    double length, width;
}