package org.game.objects;

import org.game.system.RegistryList;
import org.game.system.RegistryObject;

public class EnemyRegistries {
    public static final RegistryList<TowerObject> ENEMIES = RegistryList.create("enemy");

    public static final RegistryObject<Attacker> ATTACKER = ENEMIES.create(Attacker::new, "attacker");
}
