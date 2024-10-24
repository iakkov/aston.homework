package aston.homework.game;

public abstract class Hero {
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
    public abstract void attackEnemy(Enemy enemy);
}
