package aston.homework.game.heroes;

import aston.homework.game.Hero;

public class Warrior extends Hero {
    public Warrior(String name) {
        super(name);
    }
    @Override
    public void attackEnemy() {
        System.out.println(name + " ударил топором");
    }
}
