package Session35;

public class LiskovPrincipleAfter {
    public static void main(String[] args) {
        ShapeAfter square =new SquareAfterLis(4);
        System.out.println(square.getArea());
    }
}

interface ShapeAfter {
    int getArea();
}

class SquareAfterLis implements ShapeAfter {

    public int size;

    public SquareAfterLis(int size) {
        this.size = size;
    }

    @Override
    public int getArea() {
        return size*size;
    }
}