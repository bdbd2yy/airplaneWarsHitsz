package edu.hitsz.aircraft;

import edu.hitsz.strategy.StraightShootStrategy;

/*
 * 精锐敌机
 *
 * */
public class ElitePlusEnemy extends AbstractEnemy {

    public ElitePlusEnemy(int locationX, int locationY, int speedX, int speedY, int hp) {
        super(locationX, locationY, speedX, speedY, hp, 30);
        this.power = 20;
        this.shootNum = 2;
        setShootStrategy(new StraightShootStrategy());
    }

}
