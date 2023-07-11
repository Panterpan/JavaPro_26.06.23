package hrudin.hw_4;

public class Dog extends Animal {
    public static int dogCounter = 0;
    public Dog(String name) {
        super(name, 500, 10);
        dogCounter++;
    }
}
