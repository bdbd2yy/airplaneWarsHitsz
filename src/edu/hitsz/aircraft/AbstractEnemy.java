package edu.hitsz.aircraft;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

import edu.hitsz.application.Main;
import edu.hitsz.bullet.BaseBullet;
import edu.hitsz.bullet.EnemyBullet;
import edu.hitsz.factory.SupplyFactory;
import edu.hitsz.factory.SupplyType;
import edu.hitsz.prop.AbstractSupply;

/**
 * 敌机的抽象父类
 * 
 * @author bdbd2yy
 */
public abstract class AbstractEnemy extends AbstractAircraft {

    // 最大生命值
    protected int maxHp;
    protected int hp;

    private static final int DEFAULT_SUPPLY_SPEED = 5;

    protected double supplyRate = 0;

    protected SupplyType[] supplyTypes = new SupplyType[0];

    private final int score;

    public AbstractEnemy(int locationX, int locationY, int speedX, int speedY, int hp, int score) {
        super(locationX, locationY, speedX, speedY, hp);
        this.score = score;
    }

    @Override
    public void forward() {
        super.forward();
        if (locationY >= Main.WINDOW_HEIGHT) {
            vanish();
        }
    }

    public int getScore() {
        return score;
    }

    public AbstractSupply generateSupply() {
        if (supplyTypes.length == 0 || supplyRate <= 0) {
            return null;
        }
        if (Math.random() > supplyRate) {
            return null;
        }

        SupplyType supplyType = supplyTypes[(int) (Math.random() * supplyTypes.length)];
        return SupplyFactory.createSupply(
                supplyType,
                getLocationX(),
                getLocationY(),
                0,
                DEFAULT_SUPPLY_SPEED
        );
    }

    public List<AbstractSupply> generateSupplies() {
        List<AbstractSupply> supplies = new ArrayList<>();
        AbstractSupply supply = generateSupply();
        if (supply != null) {
            supplies.add(supply);
        }
        return supplies;
    }

    @Override
    public BaseBullet createBullet(int locationX, int locationY, int speedX, int speedY, int power) {
        return new EnemyBullet(locationX, locationY, speedX, speedY, power);
    }
}
