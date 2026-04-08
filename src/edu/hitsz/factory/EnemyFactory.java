package edu.hitsz.factory;

import edu.hitsz.aircraft.AbstractEnemy;

public interface EnemyFactory {
    public AbstractEnemy createEnemy(int locationX, int locationY);
}
