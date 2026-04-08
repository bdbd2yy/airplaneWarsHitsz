package edu.hitsz.factory;

import edu.hitsz.aircraft.AbstractAircraft;
import edu.hitsz.aircraft.MobEnemy;

public class MobEnemyFactory implements EnemyFactory {
    @Override
    public AbstractAircraft createEnemy(int locationX, int locationY, int SpeedX, int SpeedY, int hp) {
        return new MobEnemy(locationX, locationY, SpeedX, SpeedY, hp);
    }
}
