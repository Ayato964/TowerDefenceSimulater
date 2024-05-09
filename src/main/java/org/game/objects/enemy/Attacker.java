package org.game.objects.enemy;

import org.game.main.Main;
import org.game.objects.TowerModels;
import org.game.objects.TowerObject;
import org.game.util.Attribute;
import org.game.util.StageNode;

import javax.management.modelmbean.ModelMBean;
import java.awt.*;

public class Attacker extends TowerObject {
    public Attacker(){
        super(30,Main.MASTER.DW * 13, Main.MASTER.DH * 13, 5, Attribute.GREEN, TowerModels.NORMAL_MODEL);
    }

    @Override
    public boolean isIn(int x, int y) {
        return false;
    }
}
