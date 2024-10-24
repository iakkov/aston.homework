package aston.homework.game;

public class Enemy {
    private int health;
    private void takeDamage(int damage) {
        this.health = getHealth() - damage;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public int getHealth() {
        return this.health;
    }
}

