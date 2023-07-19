package hrudin.hw_6.competition.participant;

public class Robot extends Participant{
    public Robot(String name, int maxRunValue, int maxJumpValue) {
        super(name, maxRunValue, maxJumpValue);
    }

    @Override
    public void run() {
        System.out.print("Robot " + name + " runs ");
    }

    @Override
    public void jump() {
        System.out.print("Robot " + name + " jumps ");
    }
}
