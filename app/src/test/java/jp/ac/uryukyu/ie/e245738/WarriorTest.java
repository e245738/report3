package jp.ac.uryukyu.ie.e245738;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class WarriorTest {
    @Test
    void testAttackWithWeponSkill() {
        int defaultEnemyHp = 10;
        int defaultWarriorAt = 100;
        Warrior warrior = new Warrior("デモ勇者", 100, defaultWarriorAt);
        Enemy enemy = new Enemy("スライムもどき", defaultEnemyHp, 20);

        
        for (int i = 0; i < 3; i++) {
            enemy.setHitPoint(defaultEnemyHp);
            warrior.attackWithWeponSkill(enemy);
            assertEquals(150, defaultEnemyHp - enemy.getHitPoint());
            
        }
    }   
}
