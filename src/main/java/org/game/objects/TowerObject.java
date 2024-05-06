package org.game.objects;

import org.ayato.util.Display;
import org.game.util.Attribute;
import org.game.util.StageNode;

import java.awt.*;

public abstract class TowerObject implements Display {
    int x, y, w, h;
    int speed;
    int point;
    protected Attribute attribute;
    private StageNode stageNode;
    public TowerObject(){

        point = 0;
    }
    public TowerObject(int w, int h, int speed, Attribute a){
        this.w = w;
        this.h = h;
        this.speed = speed;
        attribute = a;
        point = 0;
    }
    public void setPosition(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void setStage(StageNode node){
        stageNode = node;
    }



    @Override
    public void display(Graphics graphics) {
        move();
        pointCollision();
        display(graphics, x, y);
    }

    private void pointCollision() {
        if(Math.sqrt(Math.pow(stageNode.get(point + 1).getX() - x, 2) + Math.pow(stageNode.get(point + 1).getY() - y, 2)) < speed){
            point ++;
        }
    }
    private double distance(){
        return Math.sqrt(Math.pow(stageNode.get(point).getX() - x, 2) + Math.pow(stageNode.get(point).getY() - y, 2));
    }

    public void move(){
        if(stageNode.get(point).getX() != stageNode.get(point + 1).getX()){
            if(x <= stageNode.get(point + 1).getX()){
                x += speed;
            }else{
                x -= speed;
            }
        }
        if(stageNode.get(point).getY() != stageNode.get(point + 1).getY()){
            if(y <= stageNode.get(point + 1).getY()){
                y += speed;
            }else{
                y -= speed;
            }
        }
    }
    abstract boolean isIn(int x, int y);
    abstract void display(Graphics g, int x, int y);

}
