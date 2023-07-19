package hrudin.hw_6.competition;

import hrudin.hw_6.competition.obstacle.Obstacle;
import hrudin.hw_6.competition.obstacle.Racetrack;
import hrudin.hw_6.competition.obstacle.Wall;
import hrudin.hw_6.competition.participant.Cat;
import hrudin.hw_6.competition.participant.Man;
import hrudin.hw_6.competition.participant.Participant;
import hrudin.hw_6.competition.participant.Robot;

public class Main {
    public static void main(String[] args) {

        Participant man = new Man("Fred",300,15);
        Participant cat = new Cat("Garfield",500,9);
        Participant robot = new Robot("Wally", 600,50);
        Obstacle wall = new Wall(10);
        Obstacle racetrack = new Racetrack(500);
        Participant[] participants = new Participant[] { man, cat, robot};
        Obstacle[] obstacles = new Obstacle[]  {racetrack, wall};

        for (Participant participant : participants) {
            for (Obstacle obstacle : obstacles) {
                if (!obstacle.overcome(participant)){
                    break;
                }
            }
        }
    }
}
