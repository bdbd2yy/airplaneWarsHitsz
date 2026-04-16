package edu.hitsz.factory;

import edu.hitsz.prop.AbstractSupply;
import edu.hitsz.prop.BloodSupply;
import edu.hitsz.prop.BombSupply;
import edu.hitsz.prop.FirePlusSupply;
import edu.hitsz.prop.FireSupply;
import edu.hitsz.prop.FreezeSupply;

public class SupplyFactory {

    private SupplyFactory() {
    }

    public static AbstractSupply createSupply(
        SupplyType supplyType,
        int locationX,
        int locationY,
        int speedX,
        int speedY
    ) {
        switch (supplyType) {
            case BLOOD:
                return new BloodSupply(locationX, locationY, speedX, speedY);
            case FIRE:
                return new FireSupply(locationX, locationY, speedX, speedY);
            case FIRE_PLUS:
                return new FirePlusSupply(locationX, locationY, speedX, speedY);
            case BOMB:
                return new BombSupply(locationX, locationY, speedX, speedY);
            case FREEZE:
                return new FreezeSupply(locationX, locationY, speedX, speedY);
            default:
                throw new IllegalArgumentException("Unknown supply type: " + supplyType);
        }
    }
}
