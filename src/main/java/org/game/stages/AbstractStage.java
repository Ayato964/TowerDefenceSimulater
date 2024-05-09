package org.game.stages;

import org.ayato.system.LunchScene;
import org.ayato.util.IBaseScene;
import org.game.main.Main;
import org.game.objects.enemy.EnemyRegistries;
import org.game.objects.player.Player;
import org.game.system.Wave;
import org.game.util.StageNode;

import java.awt.*;
import java.util.ArrayList;

public abstract class AbstractStage implements IBaseScene {
    public final Player player;
    private final StageNode stage;
    private ArrayList<Wave> waves = new ArrayList<>();

    public AbstractStage(){
        stage = new StageNode(true);
        setStageNode(stage);
        waves.add(new Wave(5, 40, stage, EnemyRegistries.ATTACKER.getSupObject()));
        player = new Player("Test Player", 20, 10);
    }

    @Override
    public void display(Graphics graphics) {
        makeStage(graphics);
        waves.get(0).display(graphics);
        player.display(graphics);
    }

    private void makeStage(Graphics g) {
        for(int i = 0; i < stage.size() - 2; i ++){
            Graphics2D g2 = (Graphics2D) g;
            g2.setColor(Color.WHITE);
            g2.setStroke(new BasicStroke(15 * Main.MASTER.DW));
            g2.drawLine(stage.get(i).getX(), stage.get(i).getY(), stage.get(i + 1).getX(), stage.get(i + 1).getY());
        }
    }

    @Override
    public void setup(LunchScene lunchScene) {
        lunchScene.BACKGROUND.mode.setColor(new Color(0x006400));
        player.setup(lunchScene);
    }
    protected abstract void setStageNode(StageNode node);
}
