package hrudin.hw_6.competition.participant;

public abstract class Participant {
    public String name;
    public int maxRunValue;
    public int maxJumpValue;

    public Participant(String name, int maxRunValue, int maxJumpValue) {
        this.name = name;
        this.maxRunValue = maxRunValue;
        this.maxJumpValue = maxJumpValue;
    }

    public abstract void run();

    public abstract void jump();
}
