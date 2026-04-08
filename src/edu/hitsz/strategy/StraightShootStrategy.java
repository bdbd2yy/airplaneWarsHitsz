package edu.hitsz.strategy;

import java.util.LinkedList;
import java.util.List;

import edu.hitsz.aircraft.AbstractAircraft;
import edu.hitsz.bullet.BaseBullet;

public class StraightShootStrategy implements ShootStrategy{

    @Override
    public List<BaseBullet> shoot(AbstractAircraft aircraft) {
        List<BaseBullet> bullet = new LinkedList<>();
        int shootNum = aircraft.getShootNum();
        int direction = aircraft.getDirection();
        int x = aircraft.getLocationX();
        int y = aircraft.getLocationY() + direction*2;
        int speedX = 0;
        int speedY = aircraft.getSpeedY() + direction*5;
        int power = aircraft.getPower();
        for(int i=0; i<shootNum; i++){
            bullet.add(aircraft.createBullet(
                x,
                y,
                speedX,
                speedY,
                power
            ));
        }
        return bullet;
    }
}
