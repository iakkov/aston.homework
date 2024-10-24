package aston.homework.game.heroes;
import aston.homework.game.*;

public class Mage extends Hero {
    public Mage(String name) {
        super(name);
    }
    @Override
    public void attackEnemy(Enemy enemy) {
        int damage = 15;
        System.out.println(getName() + " атакует фаерболом и наносит " + damage + " урона!");
        enemy.takeDamage(damage);
    }
}
