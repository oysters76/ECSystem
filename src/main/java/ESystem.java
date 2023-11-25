import Components.Component;
import Entities.Entity;

import java.util.ArrayList;

public class ESystem {
    private static ArrayList<Entity> entities = new ArrayList<>();


    public static void registerEntity(Entity e){
        entities.add(e);
    }

    public static ArrayList<Entity> queryByUnion(String ...filters){
        ArrayList<Entity> result = new ArrayList<>();
        back:
        for (Entity e : entities){
            for (Component c : e.getAllComponents()){
                for (String filter : filters) {
                    if (filter.equals(c.getName())) {
                        result.add(e);
                        continue back;
                    }
                }
            }
        }
        return result;
    }

    public static ArrayList<Entity> queryByIntersection(String ...filters){
        ArrayList<Entity> result = new ArrayList<>();
        back:
        for (Entity e : entities){
            for (Component c : e.getAllComponents()){
                for (String filter : filters) {
                    if (!(filter.equals(c.getName()))) {
                        continue back;
                    }
                }
            }
            result.add(e);
        }
        return result;
    }

    public static void print(ArrayList<Entity> entities){
        if (entities.isEmpty())
        {
            System.out.println("It is empty!");
            return;
        }
        for (Entity e : entities){
            System.out.println(e.print());
        }
    }

}
