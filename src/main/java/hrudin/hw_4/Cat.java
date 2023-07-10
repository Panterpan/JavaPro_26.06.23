package hrudin.hw_4;

public class Cat extends Animal {

    public static int catCounter = 0;
    public Cat(String name) {
        super(name, 200, 0);
        catCounter++;
    }
    @Override
    public void swim(int distance) {
        System.out.println("Кіт не вміє плавати");
    }
}
