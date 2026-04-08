package edu.hitsz.strategy;

import java.util.LinkedList;
import java.util.List;

import edu.hitsz.aircraft.AbstractAircraft;
import edu.hitsz.bullet.BaseBullet;

public class CircularShootStrategy implements ShootStrategy {

    private static final int BULLET_SPEED = 5;

    @Override
    public List<BaseBullet> shoot(AbstractAircraft aircraft) {
        List<BaseBullet> bullets = new LinkedList<>();
        int shootNum = aircraft.getShootNum();
        int x = aircraft.getLocationX();
        int y = aircraft.getLocationY();

        for (int i = 0; i < shootNum; i++) {
            double angle = 2 * Math.PI * i / shootNum;
            int speedX = (int) Math.round(BULLET_SPEED * Math.cos(angle));
            int speedY = (int) Math.round(BULLET_SPEED * Math.sin(angle));
            bullets.add(aircraft.createBullet(x, y, speedX, speedY, aircraft.getPower()));
        }
        return bullets;
    }
}
