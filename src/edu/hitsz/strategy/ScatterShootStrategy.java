package edu.hitsz.strategy;

import java.util.LinkedList;
import java.util.List;

import edu.hitsz.aircraft.AbstractAircraft;
import edu.hitsz.bullet.BaseBullet;

public class ScatterShootStrategy implements ShootStrategy {

    private static final int BULLET_OFFSET = 10;
    private static final int BULLET_SPEED_OFFSET = 5;

    private final int horizontalSpeedStep;

    public ScatterShootStrategy(int horizontalSpeedStep) {
        this.horizontalSpeedStep = horizontalSpeedStep;
    }

    @Override
    public List<BaseBullet> shoot(AbstractAircraft aircraft) {
        List<BaseBullet> bullets = new LinkedList<>();
        int shootNum = aircraft.getShootNum();
        int x = aircraft.getLocationX();
        int y = aircraft.getLocationY() + aircraft.getDirection() * 2;
        int speedY = aircraft.getSpeedY() + aircraft.getDirection() * BULLET_SPEED_OFFSET;

        for (int i = 0; i < shootNum; i++) {
            int speedX = (i * 2 - shootNum + 1) * horizontalSpeedStep;
            bullets.add(aircraft.createBullet(
                    x + (i * 2 - shootNum + 1) * BULLET_OFFSET,
                    y,
                    speedX,
                    speedY,
                    aircraft.getPower()
            ));
        }
        return bullets;
    }
}
