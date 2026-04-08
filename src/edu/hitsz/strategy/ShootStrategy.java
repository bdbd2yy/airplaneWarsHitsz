package edu.hitsz.strategy;

import java.util.List;

import edu.hitsz.aircraft.AbstractAircraft;
import edu.hitsz.bullet.BaseBullet;

public interface ShootStrategy {
    List<BaseBullet> shoot(AbstractAircraft aircraft);
}
