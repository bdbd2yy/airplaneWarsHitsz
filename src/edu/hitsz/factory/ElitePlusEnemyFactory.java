package edu.hitsz.factory;

import edu.hitsz.aircraft.AbstractEnemy;
import edu.hitsz.aircraft.ElitePlusEnemy;

public class ElitePlusEnemyFactory implements EnemyFactory {
    @Override
    public AbstractEnemy createEnemy(int locationX, int locationY) {
        return new ElitePlusEnemy(locationX, locationY, 1, 7, 80);
    }
}
