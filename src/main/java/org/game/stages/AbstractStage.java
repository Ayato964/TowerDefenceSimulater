package org.game.stages;

import com.fasterxml.jackson.databind.JsonNode;
import org.ayato.animation.PropertiesComponent;
import org.ayato.system.Component;
import org.ayato.system.LunchScene;
import org.ayato.util.IBaseScene;
import org.ayato.util.Position;
import org.game.main.Main;
import org.game.util.StageNode;

import java.awt.*;

public abstract class AbstractStage implements IBaseScene {
    private final StageNode stage;
    public AbstractStage(){
        stage = new StageNode(true);
        setStageNode(stage);
    }

    @Override
    public void display(Graphics graphics) {
        makeStage(graphics);
    }

    private void makeStage(Graphics g) {
        for(int i = 0; i < stage.size() - 2; i ++){
            Graphics2D g2 = (Graphics2D) g;
            g2.setStroke(new BasicStroke(15 * Main.MASTER.DW));
            g2.drawLine(stage.get(i).getX(), stage.get(i).getY(), stage.get(i + 1).getX(), stage.get(i + 1).getY());
        }
    }

    @Override
    public void setup(LunchScene lunchScene) {
        lunchScene.BACKGROUND.mode.setColor(new Color(0x006400));
        lunchScene.addAnimation("Hello World", PropertiesComponent.ofText(20, 20).color(Color.WHITE)
                .font("", 0, 1.5f));
    }
    protected abstract void setStageNode(StageNode node);
}
