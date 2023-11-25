package Entities;

import Components.Component;

import java.util.ArrayList;

public abstract class Entity {
    private final ArrayList<Component> components;

    public Entity(){
        this.components = new ArrayList<>();
    }

    protected int registerComponent(Component component){
        int index = this.components.size();
        this.components.add(component);
        return index;
    }

    public Component getComponent(int index){
        return this.components.get(index);
    }

    public ArrayList<Component> getAllComponents(){
        return this.components;
    }

    public abstract String print();

}
