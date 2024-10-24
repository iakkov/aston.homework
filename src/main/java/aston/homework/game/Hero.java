package aston.homework.game;

public class Hero {
    private String name;

    /**
     * Конструктор, который принимает имя героя
     */
    public Hero(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void attackEnemy() {
        System.out.println(name + " атакует врага.");
    }

}
