package edu.hitsz.factory;

import edu.hitsz.aircraft.AbstractAircraft;
import edu.hitsz.aircraft.EliteProEnemy;

public class EliteProEnemyFactory implements EnemyFactory {
    @Override
    public AbstractAircraft createEnemy(int locationX, int locationY, int SpeedX, int SpeedY, int hp) {
        return new EliteProEnemy(locationX, locationY, SpeedX, SpeedY, hp);
    }
}
