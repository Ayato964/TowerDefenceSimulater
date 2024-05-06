package org.game.system;

import org.ayato.util.Display;
import org.game.objects.TowerObject;
import org.game.util.StageNode;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.function.Supplier;

public class Wave implements Display {
    private final ArrayList<TowerObject> ENEMY = new ArrayList<>();
    private final int distanceTime;
    private int count = 0, view = 0;
    public Wave(int enemyValue, int distance, StageNode node){
        this(enemyValue, distance, node, (Supplier<TowerObject>[]) null);
    }
    public <T extends TowerObject> Wave(int enemyValue, int distance, StageNode node, Supplier<T>... enemies){
        distanceTime = distance;
        for(int i = 0; i < enemyValue; i ++){
            TowerObject t = enemies[new Random().nextInt(0, enemies.length)].get();
            t.setPosition(node.getX(), node.getY());
            t.setStage(node);
            ENEMY.add(t);
        }

    }
    @Override
    public void display(Graphics graphics) {
        count ++;
        if(count >= distanceTime && view < ENEMY.size()){

            count = 0;
            view ++;
        }
        for(int i = 0; i < view; i ++){
            ENEMY.get(i).display(graphics);
        }
    }
}
