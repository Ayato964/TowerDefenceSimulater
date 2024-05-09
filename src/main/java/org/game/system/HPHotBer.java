package org.game.system;

import org.ayato.animation.TextProperties;
import org.ayato.util.Display;
import org.game.main.Main;

import java.awt.*;

public class HPHotBer{

    private HPHotBer() {}

    public static void displayHotBer(Color backC, Color meterC,Graphics g, int hp, int mhp, int x, int y, int w, int h){
        int percent = getPercentDirection(hp, mhp, w * Main.MASTER.DW);
        g.setColor(backC);
        g.fillRect(x, y, w, h * Main.MASTER.DH);
        g.setColor(meterC);
        g.fillRect(x, y, percent, h * Main.MASTER.DH);
    }
    public static void displayHotBerAndViewParameter(Color backC, Color meterC, Graphics g, int hp, int mhp, int x, int y, int w, int h){
        displayHotBer(backC, meterC, g, hp, mhp, x, y, w, h);
        g.setFont(new Font("", 0, 16));
        g.drawString(hp + "/" + mhp, x, y);
    }
    private static int getPercentDirection(int hp, int mhp, int w){
        double percent = hp / mhp;
        return (int)( w * percent);
    }
}
