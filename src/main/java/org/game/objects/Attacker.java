package org.game.objects;

import org.game.main.Main;
import org.game.objects.TowerObject;
import org.game.util.Attribute;
import org.game.util.StageNode;

import java.awt.*;

public class Attacker extends TowerObject {
    public Attacker(){
        super( 100, 100, 5, Attribute.GREEN);
    }

    @Override
    boolean isIn(int x, int y) {
        return false;
    }

    @Override
    void display(Graphics g, int x, int y) {
        Graphics2D g2 = (Graphics2D) g;
        g.setColor(attribute.col);
        g2.setStroke(new BasicStroke(Main.MASTER.DW));
        g.fillOval(x - w / 2, y - h / 2, w, h);
    }
}
