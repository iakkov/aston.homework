package aston.homework.game.heroes;

import aston.homework.game.Hero;

public class Archer extends Hero {
    public Archer(String name) {
        super(name);
    }
    @Override
    public void attackEnemy() {
        System.out.println(name + " стреляет из лука");
    }
}
