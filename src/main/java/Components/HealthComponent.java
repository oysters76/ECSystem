package Components;

public class HealthComponent implements Component{
    private int health;
    public static final String NAME = "HEALTH";

    public HealthComponent(int initalHealth){
        this.health = initalHealth;
    }

    public void addHealth(int points){
        this.health += points;
    }

    public void decreaseHealth(int points){
        this.health -= points;
    }

    @Override
    public String getName() {
        return NAME;
    }
}
