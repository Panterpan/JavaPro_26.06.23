package hrudin.hw_6.competition.obstacle;

import hrudin.hw_6.competition.participant.Participant;

public abstract class Obstacle {
    public int obstacleSize;

    public Obstacle(int obstacleSize) {
        this.obstacleSize = obstacleSize;
    }

    public abstract boolean overcome(Participant participant);
}
