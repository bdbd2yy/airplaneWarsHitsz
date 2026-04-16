package edu.hitsz.prop;

import edu.hitsz.aircraft.HeroAircraft;

/**
 * 火力道具
 * 当前迭代按实验要求输出模拟激活信息
 * @author hitsz
 */
public class FireSupply extends AbstractSupply {

    public FireSupply(int locationX, int locationY, int speedX, int speedY) {
        super(locationX, locationY, speedX, speedY);
    }

    @Override
    public void activate(HeroAircraft heroAircraft) {
        heroAircraft.useScatterShoot();
        System.out.println("FireSupply active! Hero uses scatter shoot.");
    }
}
