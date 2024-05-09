package org.game.system;

import org.game.util.Attribute;

import java.awt.*;

public interface ModelDisplay {
    void display(Graphics g, int x, int y, int w, int h, Attribute attribute);
}
