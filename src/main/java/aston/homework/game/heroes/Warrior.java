package aston.homework.game.heroes;
import aston.homework.game.*;

public class Warrior extends Hero {
    public Warrior(String name) {
        super(name);
    }
    @Override
    public void attackEnemy(Enemy enemy) {
        int damage = 10;
        System.out.println(getName() + " ударил топором и нанес " + damage + " урона!");
        enemy.takeDamage(damage);
    }
}
