package org.game.objects.player;

import org.ayato.animation.AnimationGroup;
import org.ayato.animation.PropertiesComponent;
import org.ayato.system.LunchScene;
import org.ayato.util.Display;
import org.ayato.util.MouseInputs;
import org.ayato.util.Setup;
import org.game.main.Main;
import org.game.objects.TowerObject;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class Player implements Setup, Display, MouseListener {
    private int HP, MHP, MP;
    private String name;
    private TankObject haveItem;
    public ArrayList<TowerObject> TANKS;

    public Player(String name, int hp, int mp){
        HP = hp;
        MHP = HP;
        MP = mp;
        this.name = name;
        TANKS = new ArrayList<>();
        setHaveTank(new Normal());
        Main.MASTER.FRAME.addMouseListener(this);
    }

    public void setHaveTank(TankObject t){
        haveItem = t;
        haveItem.isMove = true;
    }
    public void removeHaveTank(){
        haveItem = null;
    }
    public void releaseTank(){
        haveItem.isMove = false;
        TANKS.add(haveItem);
        removeHaveTank();

    }
    @Override
    public void setup(LunchScene lunchScene) {
        lunchScene.addAnimation(name, PropertiesComponent.ofText(10, 5)
                .font("", Font.BOLD, 2)
                .color(Color.BLACK)
        );
    }

    @Override
    public void display(Graphics graphics) {
        if(haveItem != null) {
            haveItem.display(graphics);
        }
        for(TowerObject t : TANKS){
            t.display(graphics);
        }
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        if(haveItem != null)
            releaseTank();
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {

    }
}
