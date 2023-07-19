package hrudin.hw_6.competition.participant;

public class Man extends Participant {
    public Man(String name, int maxRunValue, int maxJumpValue) {
        super(name, maxRunValue, maxJumpValue);
    }

    @Override
    public void run() {
        System.out.print("Man " + name + " runs ");
    }

    @Override
    public void jump() {
        System.out.print("Man " + name + " jumps ");
    }
}
