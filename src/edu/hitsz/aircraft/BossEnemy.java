package edu.hitsz.aircraft;

import edu.hitsz.application.Main;
import edu.hitsz.strategy.CircularShootStrategy;

/*
 * Boss敌机
 *
 * */
public class BossEnemy extends AbstractEnemy {

    public BossEnemy(int locationX, int locationY, int speedX, int speedY, int hp) {
        super(locationX, locationY, speedX, speedY, hp, 100);
        // 子弹威力
        this.power = 30;
        // 每次发射子弹数量
        this.shootNum = 20;
        setShootStrategy(new CircularShootStrategy());
    }

    // Boss 取消纵向速度
    @Override
    public void forward() {
        locationX += speedX;
        if (locationX <= 0 || locationX >= Main.WINDOW_WIDTH) {
            // 横向超出边界后反向
            speedX = -speedX;
        }
    }

}
