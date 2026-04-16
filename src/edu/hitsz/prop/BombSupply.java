package edu.hitsz.prop;

import edu.hitsz.aircraft.HeroAircraft;

/**
 * 炸弹道具
 * 当前迭代仅完成类定义
 * @author hitsz
 */
public class BombSupply extends AbstractSupply {

    public BombSupply(int locationX, int locationY, int speedX, int speedY) {
        super(locationX, locationY, speedX, speedY);
    }

    @Override
    public void activate(HeroAircraft heroAircraft) {
        System.out.println("BombSupply active! Bomb effect triggered.");
    }
}
