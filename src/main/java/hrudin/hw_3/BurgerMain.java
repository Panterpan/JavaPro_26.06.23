package hrudin.hw_3;

public class BurgerMain {
    public static void main(String[] args) {
        Burger originalBurger = new Burger("Булочка", 1,"сир", "зелень", true);
        Burger dieticBurger = new Burger("Булочка", 1, "сир", "зелень", false);
        Burger doubleBurger = new Burger("Булочка", 1, 1, "сир", "зелень", true);
    }
}
