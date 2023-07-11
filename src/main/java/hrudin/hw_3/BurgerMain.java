package hrudin.hw_3;

public class BurgerMain {
    public static void main(String[] args) {
        Burger originalBurger = new Burger("Булочка",1, "сир", "зелень", true);
        Burger dieticBurger = new Burger("Булочка", "сир", "зелень");
        Burger doubleBurger = new Burger("Булочка",2,  "сир", "зелень", true);
    }

}
