package ball.model;

import ball.Ball;

public class Elastic implements Behaviour {
    public static final int GROWTH_RATE = 2;

    static final int GROW = 1;
    static final int SHRINK = -1;

    private int growthDirection;

    Elastic(int growthDirection) {
        this.growthDirection = growthDirection;
    }

    @Override
    public void applyBehaviour(BallImpl ball) {
        growthDirection = reverseGrowthDirectionIfNecessary(ball);
        ball.radius = next(ball);
    }

    /***********************************************************************************
     *
     * Do not change Elastic ALGORITHM below.
     *
     ***********************************************************************************/

    private int reverseGrowthDirectionIfNecessary(BallImpl ball) {
        if (growingTooBig(ball) || shrinkingTooSmall(ball)) {
            return switchDirection();
        }

        return this.growthDirection;
    }

    private boolean shrinkingTooSmall(BallImpl ball) {
        return ball.radius <= 0 && shrinking();
    }

    private boolean growingTooBig(BallImpl ball) {
        return ball.radius >= Ball.DEFAULT_RADIUS && growing();
    }

    private int switchDirection() {
        return growing() ? SHRINK : GROW;
    }

    private int next(BallImpl ball) {
        return ball.radius + (GROWTH_RATE * growthDirection);
    }

    private boolean shrinking() {
        return growthDirection == SHRINK;
    }

    private boolean growing() {
        return growthDirection == GROW;
    }
}
