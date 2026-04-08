package edu.hitsz.aircraft;

import edu.hitsz.application.Main;
import edu.hitsz.bullet.BaseBullet;
import edu.hitsz.bullet.EnemyBullet;

/**
 * 敌机的抽象父类
 * 
 * @author hitsz
 */
// TODO: add supplies to Enemy
public abstract class AbstractEnemy extends AbstractAircraft {

    // 最大生命值
    protected int maxHp;
    protected int hp;

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

    @Override
    public BaseBullet createBullet(int locationX, int locationY, int speedX, int speedY, int power) {
        return new EnemyBullet(locationX, locationY, speedX, speedY, power);
    }
}
