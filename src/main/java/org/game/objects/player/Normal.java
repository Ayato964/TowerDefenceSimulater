package org.game.objects.player;

import org.game.main.Main;
import org.game.objects.TowerModels;
import org.game.objects.TowerObject;
import org.game.util.Attribute;

import java.awt.*;

public class Normal extends TankObject {
    public Normal() {
        super(20, 15 * Main.MASTER.DW, 15 * Main.MASTER.DH, 0, Attribute.GREEN, TowerModels.NORMAL_MODEL);
    }

    @Override
    public boolean isIn(int x, int y) {
        return false;
    }

}
