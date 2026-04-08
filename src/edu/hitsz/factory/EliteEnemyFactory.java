package edu.hitsz.factory;

import edu.hitsz.aircraft.AbstractAircraft;
import edu.hitsz.aircraft.EliteEnemy;

public class EliteFactory implements EnemyFactory {
    @Override
    public AbstractAircraft createEnemy(int locationX, int locationY, int SpeedX, int SpeedY, int hp) {
        return new EliteEnemy(locationX, locationY, SpeedX, SpeedY, hp);
    }
}
