package hrudin.hw_4;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Bob");
        Cat cat2 = new Cat("Nick");
        Dog dog = new Dog("Jack");
        dog.swim(5);
        dog.run(500);
        cat2.swim(3);
        System.out.println("Кількість створених котів:  " + Cat.catCounter);
        System.out.println("Кількість створених собак:  " + Dog.dogCounter);
        System.out.println("Кількість створених тварин:  " + Animal.animalCounter);
    }
}
