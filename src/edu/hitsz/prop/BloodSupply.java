package edu.hitsz.prop;

import edu.hitsz.aircraft.HeroAircraft;

public class BloodSupply extends AbstractSupply {

    private static final int RECOVER_HP = 20;

    public BloodSupply(int locationX, int locationY, int speedX, int speedY) {
        super(locationX, locationY, speedX, speedY);
    }

    @Override
    public void activate(HeroAircraft heroAircraft) {
        heroAircraft.decreaseHp(RECOVER_HP);
    }

}
