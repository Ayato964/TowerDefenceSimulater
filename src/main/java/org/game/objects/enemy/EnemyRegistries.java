package org.game.objects.enemy;

import org.game.objects.TowerObject;
import org.game.objects.enemy.Attacker;
import org.game.system.RegistryList;
import org.game.system.RegistryObject;

public class EnemyRegistries {
    public static final RegistryList<TowerObject> ENEMIES = RegistryList.create("enemy");

    public static final RegistryObject<Attacker> ATTACKER = ENEMIES.create(Attacker::new, "attacker");
}
