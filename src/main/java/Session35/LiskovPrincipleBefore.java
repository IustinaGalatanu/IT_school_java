package Session35;

public class LiskovPrincipleBefore {
    public static void main(String[] args) {
        //before
        RectangularBefore rectangularBefore=new RectangularBefore(5,10);
        rectangularBefore.setHeight(6);
        rectangularBefore.setWidth(12);
        System.out.println(rectangularBefore.getArea());

        SquareBefore squareBefore=new SquareBefore(4);
        squareBefore.setHeight(5);
        squareBefore.setWidth(3);
        System.out.println(squareBefore.getArea());
    }
}

class RectangularBefore {
    public int width;
    public int height;

    public RectangularBefore(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getArea() {
        return width*height;
    }
}

class SquareBefore extends RectangularBefore{

    public SquareBefore(int length) {
        super(length,length);
    }

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    @Override
    public void setHeight(int height) {
        super.setHeight(height);
        super.setWidth(height);
    }
}
