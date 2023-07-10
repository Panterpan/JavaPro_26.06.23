package hrudin.hw_3;

public class Burger {
    String bun;
    int meat;
    int doubleMeat;
    String cheese;
    String salad;
    boolean mayonnaise;

    public Burger(String bun, int meat, String cheese, String salad, boolean mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.salad = salad;
        this.mayonnaise = mayonnaise;
        if (mayonnaise) {
            System.out.println("Звичайний бургер з: " + this.bun + ", " + "м'ясо: " + this.meat + ", " + this.cheese + ", " + this.salad + " ,майонез");
        } else
            System.out.println("Дієтичний бургер: " + this.bun + ", " + "м'ясо: " + this.meat + ", " + this.cheese + ", " + this.salad);
    }

    public Burger(String bun, int meat, int doubleMeat, String cheese, String salad, boolean mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.doubleMeat = doubleMeat;
        this.cheese = cheese;
        this.salad = salad;
        this.mayonnaise = mayonnaise;
        System.out.println("Подвійний бургер з: " + this.bun + ", " + "м'ясо: " + (this.meat + this.doubleMeat) + ", " + this.cheese + ", " + this.salad + " ,майонез");
    }
}
