package org.game.util;

import org.ayato.util.Position;
import org.game.main.Main;

public class StageNode {
    private int x, y;
    public StageNode next;
    public boolean isFirstNode;
    public StageNode(){}
    public StageNode(boolean isFirstNode){
        this.isFirstNode = isFirstNode;
    }

    public StageNode add(int x, int y){
        this.x = x;
        this.y = y;
        next = new StageNode();
        return next;
    }
    public StageNode get( int i){
        if(i == 0)
            return this;
        else
            return next.get(i - 1);

    }

    public int getX() {
        return x * Main.MASTER.DW;
    }

    public int getY() {
        return y * Main.MASTER.DH;
    }

    public int size(){
        return next != null ?1 +  next.size() : 1;
    }
}
