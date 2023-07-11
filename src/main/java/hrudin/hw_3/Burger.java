package hrudin.hw_3;

public class Burger {
    String bun;
    int meat = 1;
    String cheese;
    String salad;
    boolean mayonnaise;
    public Burger(String bun, String cheese, String salad, boolean mayonnaise) {
        this.bun = bun;
        this.cheese = cheese;
        this.salad = salad;
        this.mayonnaise = mayonnaise;
    }
    public Burger(String bun, int meat, String cheese, String salad, boolean mayonnaise) {
        this (bun, cheese, salad, mayonnaise);
        this.meat = meat;
        if (this.meat == 1) {
            System.out.println("Звичайний бургер з: " + this.bun + ", " + "м'ясо: " + this.meat + ", " + this.cheese + ", " + this.salad + ", майонез");
        } else {
            System.out.println("Подвійний бургер з: " + this.bun + ", " + "м'ясо: " + this.meat + ", " + this.cheese + ", " + this.salad + ", майонез");
        }
    }
    public Burger(String bun, String cheese, String salad) {
        this (bun, cheese, salad,false);
        System.out.println("Дієтичний бургер з: " + this.bun + ", " + "м'ясо: " + this.meat + ", " + this.cheese + ", " + this.salad);
    }

}
