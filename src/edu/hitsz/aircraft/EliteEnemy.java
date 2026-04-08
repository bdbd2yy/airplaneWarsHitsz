package edu.hitsz.aircraft;

import edu.hitsz.strategy.StraightShootStrategy;

/*
 * 精英敌机
 *
 * */
public class EliteEnemy extends AbstractEnemy {

    public EliteEnemy(int locationX, int locationY, int speedX, int speedY, int hp) {
        super(locationX, locationY, speedX, speedY, hp, 20);
        setShootStrategy(new StraightShootStrategy());
    }

}
