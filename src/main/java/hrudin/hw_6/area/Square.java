package hrudin.hw_6.area;

public class Square implements  AreaCalculable{
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
