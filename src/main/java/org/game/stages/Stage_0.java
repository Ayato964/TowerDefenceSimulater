package org.game.stages;

import org.ayato.system.LunchScene;
import org.ayato.util.Position;
import org.game.util.StageNode;

import java.awt.*;

public class Stage_0 extends AbstractStage{
    public Stage_0(){
        super();
    }

    @Override
    protected void setStageNode(StageNode node) {
        node.add(10, 0)
                .add(10, 50)
                .add(200, 50)
                .add(200, 10)
                .add(300, 10)
                .add(300, 50)
                .add(420, 50)
                .add(420, 180)
                .add(200, 180)
                .add(200, 100)
                .add(100, 100)
                .add(100, 150)
                .add(300, 150)
                .add(300, 100)
                .add(200, 100)
                .add(200, 220);

    }
}
