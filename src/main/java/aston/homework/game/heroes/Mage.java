package aston.homework.game.heroes;

import aston.homework.game.Hero;

public class Mage extends Hero {
    public Mage(String name) {
        super(name);
    }
    public void attackEnemy() {
        System.out.println("Атака фаерболом.");
    }
}
