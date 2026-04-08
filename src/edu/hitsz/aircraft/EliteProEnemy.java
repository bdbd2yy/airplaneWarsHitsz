package edu.hitsz.aircraft;

import edu.hitsz.strategy.ScatterShootStrategy;

/*
 * 王牌敌机
 *
 * */
public class EliteProEnemy extends AbstractEnemy {

    public EliteProEnemy(int locationX, int locationY, int speedX, int speedY, int hp) {
        super(locationX, locationY, speedX, speedY, hp, 50);
        setShootStrategy(new ScatterShootStrategy());
    }
}
