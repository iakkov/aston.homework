package aston.homework.game.heroes;
import aston.homework.game.*;

public class Archer extends Hero {
    public Archer(String name) {
        super(name);
    }
    @Override
    public void attackEnemy(Enemy enemy) {
        int damage = 8;
        System.out.println(getName() + " стреляет из лука и наносит " + damage + " урона!");
        enemy.takeDamage(damage);
    }
}
