package edu.hitsz.prop;

import edu.hitsz.aircraft.HeroAircraft;

/**
 * 超级火力道具
 * 当前迭代按实验要求输出模拟激活信息
 * @author hitsz
 */
public class FirePlusSupply extends AbstractSupply {

    public FirePlusSupply(int locationX, int locationY, int speedX, int speedY) {
        super(locationX, locationY, speedX, speedY);
    }

    @Override
    public void activate(HeroAircraft heroAircraft) {
        heroAircraft.useCircularShoot();
        System.out.println("FirePlusSupply active! Hero uses circular shoot.");
    }
}
