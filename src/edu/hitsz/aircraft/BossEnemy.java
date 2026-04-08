package edu.hitsz.aircraft;

import edu.hitsz.bullet.BaseBullet;
import edu.hitsz.aircraft.AbstractAircraft;

import edu.hitsz.application.Main;
import edu.hitsz.bullet.HeroBullet;
import edu.hitsz.strategy.CircularShootStrategy;

import java.util.LinkedList;
import java.util.List;

public class BossEnemy extends AbstractEnemy {

    //子弹射击方向 (向上发射：-1，向下发射：1)
    private int direction = -1;

    public BossEnemy(int locationX, int locationY, int speedX, int speedY, int hp) {
        super(locationX, locationY, speedX, speedY, hp, 100);
        // 子弹威力
        this.power = 30;
        // 每次发射子弹数量
        this.shootNum = 20;
        SetStrategy(new CircularShootStrategy());
    }

    // 取消纵向速度
    @Override
    public void forward() {
        locationX += speedX;
        if (locationX <= 0 || locationX >= Main.WINDOW_WIDTH) {
            // 横向超出边界后反向
            speedX = -speedX;
        }
    }

    // TODO: modify the shoot for BossEnemy
    @Override
    public List<BaseBullet> shoot() {
        List<BaseBullet> res = new LinkedList<>();
        int x = this.getLocationX();
        int y = this.getLocationY() + direction*2;
        int speedX = 0;
        int speedY = this.getSpeedY() + direction*5;
        BaseBullet bullet;
        for(int i=0; i<shootNum; i++){
            // 子弹发射位置相对飞机位置向前偏移
            // 多个子弹横向分散
            bullet = new HeroBullet(x + (i*2 - shootNum + 1)*10, y, speedX, speedY, power);
            res.add(bullet);
        }
        return res;
    }

}
