package org.game.main;

import org.ayato.system.LangLoader;
import org.ayato.system.LunchScene;
import org.game.stages.Stage_0;

public class Main {
    public static final LunchScene MASTER = new LunchScene("TowerDefense", true);
    public static void main(String[] args) {
        LangLoader.create(LangLoader.JAPANESE);
        MASTER.setVisible(true);
        MASTER.changeScene(new Stage_0());
    }
}