package day49_Abstraction.ShapeTask;

public class Square extends Shape{

    public double side;

    public Square(double side) {
        super("Square");
        this.side = side;
    }


    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimeter() {
        return 0;
    }
}
