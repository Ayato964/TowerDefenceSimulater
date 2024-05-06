package org.game.util;

import org.w3c.dom.Attr;

import java.awt.*;

public enum Attribute {
    BOSS(Color.BLACK),
    RED(Color.RED),
    GREEN(Color.GREEN),
    BLUE(Color.BLUE);
    public final Color col;
    private Attribute(Color c){
        col = c;
    }
}
