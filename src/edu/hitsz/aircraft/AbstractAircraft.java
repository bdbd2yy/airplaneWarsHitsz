package edu.hitsz.aircraft;

import edu.hitsz.bullet.BaseBullet;
import edu.hitsz.strategy.NoShootStrategy;
import edu.hitsz.strategy.ShootStrategy;
import edu.hitsz.basic.AbstractFlyingObject;
import java.util.List;

/**
 * 所有种类飞机的抽象父类
 * 
 * @author hitsz
 */
public abstract class AbstractAircraft extends AbstractFlyingObject {

    // the context's shootStrategy
    private ShootStrategy shootStrategy = new NoShootStrategy();
    // 最大生命值
    protected int maxHp;
    protected int hp;
    protected int shootNum;
    protected int direction = 1;
    protected int power = 10;

    public AbstractAircraft(int locationX, int locationY, int speedX, int speedY, int hp) {
        super(locationX, locationY, speedX, speedY);
        this.hp = hp;
        this.maxHp = hp;
    }

    public void decreaseHp(int decrease) {
        hp -= decrease;
        if (hp <= 0) {
            hp = 0;
            vanish();
        }
    }

    public int getHp() {
        return hp;
    }

    /**
     * 飞机射击方法
     *
     * @return 策略模式下各自策略的 shoot 方法
     */
    public List<BaseBullet> shoot() {
        return shootStrategy.shoot(this);
    }

    // set the shoot strategy
    public void setShootStrategy(ShootStrategy strategy) {
        this.shootStrategy = strategy;
    }

    public int getShootNum() {
        return shootNum;
    }

    public void setShootNum(int shootNum) {
        this.shootNum = shootNum;
    }

    public int getDirection() {
        return direction;
    }

    public int getPower() {
        return power;
    }

    public abstract BaseBullet createBullet(int locationX, int locationY, int speedX, int speedY, int power);
}
