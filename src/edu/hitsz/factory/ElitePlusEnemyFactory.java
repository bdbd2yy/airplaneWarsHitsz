package edu.hitsz.factory;

import edu.hitsz.aircraft.AbstractAircraft;
import edu.hitsz.aircraft.ElitePlusEnemy;

public class ElitePlusEnemyFactory implements EnemyFactory {
    @Override
    public AbstractAircraft createEnemy(int locationX, int locationY, int SpeedX, int SpeedY, int hp) {
        return new ElitePlusEnemy(locationX, locationY, SpeedX, SpeedY, hp);
    }
}
