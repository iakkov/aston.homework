package aston.homework.game;

public class Enemy {
    private int health;
    
    /**
     * Конструктор
     */
    public Enemy(int health) {
    	this.health = health;
    }
    public void setHealth(int health) {
    	this.health = health;  
    }
    public int getHealth() {
        return health;
    }
    public void takeDamage(int damage) {
    	if (health > damage) {
    		health -=damage;
    	}
    	else {
    		health = 0;
    	}
    	System.out.println("Враг получил урон, текущее здоровье: " + health);
    }
}

