package hrudin.hw_6.competition.obstacle;

import hrudin.hw_6.competition.participant.Participant;

public class Wall extends Obstacle {
    public Wall(int maxValue) {
        super(maxValue);
    }

    @Override
    public boolean overcome(Participant participant) {
        if (obstacleSize <= participant.maxJumpValue) {
            participant.jump();
            System.out.println("over the wall on height " + obstacleSize);
            return true;
        } else {
            System.out.println(
                    "Participant " + participant.name +
                            " couldnt overcome wall on height " +
                            obstacleSize + ". Complited " +
                            participant.maxJumpValue
            );

            return false;
        }

    }
}
