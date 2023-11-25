import Components.HealthComponent;
import Entities.Entity;
import Entities.Player;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {

        Player player = new Player();
        HealthComponent component = new HealthComponent(100);
        player.addHealthComponent(component);

        ESystem.registerEntity(player);
        ArrayList<Entity> resultUnion = ESystem.queryByUnion(HealthComponent.NAME, "test");

        ESystem.print(resultUnion);

        ESystem.print(
                ESystem.queryByIntersection(HealthComponent.NAME, "Test")
        );
    }
}
