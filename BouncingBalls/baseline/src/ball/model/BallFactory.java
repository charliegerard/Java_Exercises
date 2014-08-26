package ball.model;

import ball.Ball;

import java.util.ArrayList;

public class BallFactory {

    public static Ball[] all() {
        return new Ball[]{
                bouncingBall(75, 50, Bouncing.DOWN),
                elasticBall(250, 100, Ball.DEFAULT_RADIUS, Elastic.SHRINK),
                bouncingElasticBall(500, 100, Bouncing.DOWN, Elastic.SHRINK)
        };
    }

    public static Ball bouncingBall(int centerX, int centerY, int direction) {
        ArrayList<Behaviour> behaviourList = new ArrayList<Behaviour>();
        behaviourList.add(new Bouncing(direction));
        return new BallImpl(centerX, centerY, Ball.DEFAULT_RADIUS, behaviourList);
    }

    public static Ball elasticBall(int centerX, int centerY, int radius, int direction) {
        ArrayList<Behaviour> behaviourList = new ArrayList<Behaviour>();
        behaviourList.add(new Elastic(direction));
        return new BallImpl(centerX, centerY, radius, behaviourList) {
        };
    }

    public static Ball bouncingElasticBall(int centerX, int centerY, int bouncingDirection, int elasticDirection ){
        ArrayList<Behaviour> behaviourList = new ArrayList<Behaviour>();
        behaviourList.add(new Bouncing(bouncingDirection));
        behaviourList.add(new Elastic(elasticDirection));
        return new BallImpl(centerX, centerY, Ball.DEFAULT_RADIUS, behaviourList);
    }
}
