package org.game.objects;

import org.game.main.Main;
import org.game.system.ModelDisplay;

import java.awt.*;
import java.util.function.Consumer;

public class TowerModels {
    public static ModelDisplay NORMAL_MODEL = ((g, x, y, w, h, attribute) -> {
        Graphics2D g2 = (Graphics2D) g;
        g.setColor(attribute.col);
        g2.setStroke(new BasicStroke(Main.MASTER.DW));
        g.fillOval(x - w / 2, y - h / 2, w, h);
    });

}
