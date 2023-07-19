package hrudin.hw_6.competition.obstacle;

import hrudin.hw_6.competition.participant.Participant;

public class Racetrack extends Obstacle {
    public Racetrack(int maxValue) {
        super(maxValue);
    }

    @Override
    public boolean overcome(Participant participant) {
        if (obstacleSize <= participant.maxRunValue) {
            participant.run();
            System.out.println("on a treadmill on length " + obstacleSize);
            return true;
        } else {
            System.out.println(
                    "Participant " + participant.name +
                    " couldnt overcome racetrack on distance " +
                    obstacleSize + ". Complited " +
                    participant.maxRunValue
            );
            return false;
        }
    }
}
