package ball.model;

import ball.Ball;
import ball.ui.BallWorld;
import org.junit.Test;

import static ball.BallTestHarness.*;

public class BouncingBallTest {
    @Test
    public void shouldGoDown() throws Exception {
        Ball bouncingBall = BallFactory.bouncingBall(0, 100, Bouncing.DOWN);

        bouncingBall.update();

        assertCenterYCoordinateIs(oneStepDownFrom(100), bouncingBall);
    }

    @Test
    public void shouldGoUpAfterHittingTheBottom() throws Exception {
        int theBottomEdge = BallWorld.BOX_HEIGHT - Ball.DEFAULT_RADIUS;
        Ball bouncingBall = BallFactory.bouncingBall(0, theBottomEdge, Bouncing.DOWN);

        bouncingBall.update();

        assertCenterYCoordinateIs(oneStepUpFrom(theBottomEdge), bouncingBall);
    }

    @Test
    public void shouldGoUp() throws Exception {
        Ball bouncingBall = BallFactory.bouncingBall(0, 100, Bouncing.UP);

        bouncingBall.update();

        assertCenterYCoordinateIs(oneStepUpFrom(100), bouncingBall);
    }

    @Test
    public void shouldGoDownAfterHittingTheTop() throws Exception {
        int theTopEdge = Ball.DEFAULT_RADIUS;
        Ball bouncingBall = BallFactory.bouncingBall(0, theTopEdge, Bouncing.UP);

        bouncingBall.update();

        assertCenterYCoordinateIs(oneStepDownFrom(theTopEdge), bouncingBall);
    }
}
