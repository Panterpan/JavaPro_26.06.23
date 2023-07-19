package hrudin.hw_6.competition.participant;

public class Cat extends Participant{
    public Cat(String name, int maxRunValue, int maxJumpValue) {
        super(name, maxRunValue, maxJumpValue);
    }

    @Override
    public void run() {
        System.out.print("Cat " + name + " runs ");
    }

    @Override
    public void jump() {
        System.out.print("Cat " + name + " jumps ");
    }
}
