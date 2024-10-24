package aston.homework.game.heroes;

import aston.homework.game.*;

public class Battleground {
    public static void main(String[] args) {
        Hero warrior = new Warrior("Варвар");
        Hero mage = new Mage("Маг");
        Hero archer = new Archer("Лучник");

        Enemy enemy = new Enemy(40);

        warrior.attackEnemy(enemy);
        mage.attackEnemy(enemy);
        archer.attackEnemy(enemy);

        if (!enemy.isAlive()) {
            System.out.println("Враг умер");
        }
        else {
            System.out.println("Враг выжил");
        }
    }

}
