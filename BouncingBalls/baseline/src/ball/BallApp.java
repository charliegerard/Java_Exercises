package ball;

import ball.model.BallFactory;
import ball.ui.BallWorld;

import javax.swing.*;

// DO NOT CHANGE
public class BallApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("Bouncing Ball Dojo");
                frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                frame.setContentPane(
                        new BallWorld(BallFactory.all())
                );
                frame.pack();
                frame.setVisible(true);
            }
        });
    }
}
