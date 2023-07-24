package hrudin.hw_6.area;

public class Main {
    public static void main(String[] args) {
        AreaCalculable circle = new Circle(3);
        Square square = new Square(12);
        Triangle triangle = new Triangle(15,10,9);
        AreaCalculable[] areaCalculables = new AreaCalculable[] {circle, square, triangle};
        System.out.println(sumAreas(areaCalculables));
        System.out.println(circle.getArea());
    }
    public static double sumAreas(AreaCalculable[] areaCalculables) {
        double summ = 0;
        for (AreaCalculable areaCalculable : areaCalculables) {
            summ += areaCalculable.getArea();
        }
        return summ;
    }
}
