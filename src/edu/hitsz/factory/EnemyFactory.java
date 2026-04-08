package edu.hitsz.factory;

import edu.hitsz.aircraft.AbstractAircraft;

public interface EnemyFactory {
    public AbstractAircraft createEnemy(int locationX, int locationY, int speedX, int speedY, int hp);
}
