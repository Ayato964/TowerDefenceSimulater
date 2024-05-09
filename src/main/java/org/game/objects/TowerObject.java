package org.game.objects;

import org.ayato.util.Display;
import org.ayato.util.Position;
import org.game.main.Main;
import org.game.system.HPHotBer;
import org.game.system.ModelDisplay;
import org.game.util.Attribute;
import org.game.util.StageNode;

import java.awt.*;

public abstract class TowerObject implements Display {
    int x, y;
    protected Position position;
    private int HP, MHP;
    int speed;
    int point;
    protected Attribute attribute;
    private StageNode stageNode;
    protected final ModelDisplay model;
    public TowerObject(int hp, int w, int h, int speed, Attribute a, ModelDisplay m){
        this.speed = speed;
        HP = hp;
        MHP = HP;
        attribute = a;
        point = 0;
        model = m;
        position = new Position(()->x, ()->y, w, h);
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
        model.display(graphics, position.getX(), position.getY(), position.w, position.h, attribute);
        if(HP != MHP)
            HPHotBer.displayHotBerAndViewParameter(Color.WHITE, Color.RED, graphics, HP, MHP, position.getX(), position.getY(), position.w / 2, 5);
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
    public abstract boolean isIn(int x, int y);

}
