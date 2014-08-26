package ball.model;

import ball.ui.BallWorld;

public class Bouncing implements Behaviour {
    public static final int MOVEMENT_SPEED = 12;

    static final int DOWN = 1;
    static final int UP = -1;

    private int direction;

    Bouncing(int direction) {
        this.direction = direction;
    }

    @Override
    public void applyBehaviour(BallImpl ball) {
        direction = reverseDirectionIfNecessary(ball);
        ball.y = move(ball);
    }


    /***********************************************************************************
     *
     * Do not change Bouncing ALGORITHM below.
     *
     ***********************************************************************************/

    private int reverseDirectionIfNecessary(BallImpl ball) {
        if (movingTooHigh(ball) || movingTooLow(ball)) {
            return switchDirection();
        }

        return this.direction;
    }

    private boolean movingTooLow(BallImpl ball) {
        return ball.y + ball.radius >= BallWorld.BOX_HEIGHT && movingDown();
    }

    private boolean movingTooHigh(BallImpl ball) {
        return ball.y - ball.radius <= 0 && movingUp();
    }

    private int switchDirection() {
        return movingDown() ? UP : DOWN;
    }

    private int move(BallImpl ball) {
        return ball.y + (MOVEMENT_SPEED * direction);
    }

    private boolean movingDown() {
        return direction == DOWN;
    }

    private boolean movingUp() {
        return direction == UP;
    }

}
