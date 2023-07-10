package hrudin.hw_4;

public abstract class Animal {
    String name;
    int runningMaxDistance;
    int swimmingMaxDistance;

   public static int animalCounter = 0;

    public Animal(String name, int runningMaxDistance, int swimmingMaxDistance) {
        this.name = name;
        this.runningMaxDistance = runningMaxDistance;
        this.swimmingMaxDistance = swimmingMaxDistance;
        animalCounter++;
    }
    public void run(int distance) {
        if (runningMaxDistance >= distance) {
        System.out.println(this.name + " пробіг " + distance + " м.");
        } else {
            System.out.println(this.name + " не може пробігти більше " + this.runningMaxDistance + " м.");
        }
    }
    public void swim(int distance) {
        if (swimmingMaxDistance >= distance) {
            System.out.println(this.name + " проплив " + distance + " м.");
        } else {
            System.out.println(this.name + " не може пропливти більше " + this.swimmingMaxDistance + " м.");
        }
    }
}
