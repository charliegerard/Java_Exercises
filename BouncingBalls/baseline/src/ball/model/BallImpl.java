package ball.model;

import ball.Ball;

import java.awt.*;
import java.util.ArrayList;

public class BallImpl implements Ball {
    protected int x;
    protected int y;
    protected int radius;
    protected ArrayList<Behaviour> behaviours;

    protected BallImpl(int x, int y, int radius, ArrayList<Behaviour> behaviours) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.behaviours = behaviours;
    }

    // DO NOT CHANGE
    @Override
    public int radius() {
        return radius;
    }

    // DO NOT CHANGE
    @Override
    public Point center() {
        return new Point(x, y);
    }

    // DO NOT CHANGE
    @Override
    public void update(){
        for(Behaviour behaviour : behaviours){
            behaviour.applyBehaviour(this);
        }
    }
}
