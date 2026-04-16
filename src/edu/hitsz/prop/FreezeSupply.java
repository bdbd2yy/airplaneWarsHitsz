package edu.hitsz.prop;

import edu.hitsz.aircraft.HeroAircraft;

/**
 * 冰冻道具
 * 当前迭代仅完成类定义
 * @author hitsz
 */
public class FreezeSupply extends AbstractSupply {

    public FreezeSupply(int locationX, int locationY, int speedX, int speedY) {
        super(locationX, locationY, speedX, speedY);
    }

    @Override
    public void activate(HeroAircraft heroAircraft) {
        System.out.println("FreezeSupply active! Freeze effect triggered.");
    }
}
