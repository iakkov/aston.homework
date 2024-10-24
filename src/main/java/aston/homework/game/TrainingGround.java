package aston.homework.game;
import aston.homework.game.heroes.*;

public class TrainingGround {

    public static void main(String[] args) {
        Warrior warrior = new Warrior("Jack");
        Mage mage = new Mage("William");
        Archer archer = new Archer("Jose");
        warrior.attackEnemy();
        mage.attackEnemy();
        archer.attackEnemy();

    }

}
