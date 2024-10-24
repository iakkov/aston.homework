package aston.homework.game;

public class Hero {
    private String name;

    public Hero(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void attackEnemy() {
        System.out.println("Герой атакует врага.");

    }

}
