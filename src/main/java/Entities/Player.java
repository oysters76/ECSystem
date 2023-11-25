package Entities;

import Components.HealthComponent;

public class Player extends Entity {

    private String name;
    private int healthComponentIndex;

    public Player(){
    }

    @Override
    public String print() {
        return "Player!";
    }

    public void addHealthComponent(HealthComponent component){
        healthComponentIndex = this.registerComponent(component);
    }

    public HealthComponent getHealthComponent(){
        return (HealthComponent) this.getComponent(healthComponentIndex);
    }


}
