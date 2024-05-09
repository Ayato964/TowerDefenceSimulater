package org.game.objects.player;

import org.ayato.util.IListenerDecoder;
import org.ayato.util.MouseInputs;
import org.game.objects.TowerModels;
import org.game.objects.TowerObject;
import org.game.system.ModelDisplay;
import org.game.util.Attribute;

import java.awt.*;

public class TankObject extends TowerObject implements IListenerDecoder {
    public boolean isMove = false;
    public TankObject(int hp, int w, int h, int speed, Attribute a, ModelDisplay m) {
        super(hp, w, h, speed, a, m);
        MouseInputs.add(position, this); //クリックされたら自分のステータスを表示したい
    }

    @Override
    public void display(Graphics graphics) {
        if(isMove){
            Point point = MouseInfo.getPointerInfo().getLocation();
            setPosition((int)point.getX(),(int) point.getY());
        }
        model.display(graphics, position.getX(), position.getY(), position.w, position.h,attribute);
    }

    @Override
    public boolean isIn(int x, int y) {
        return false;
    }

    @Override
    public void overlap() {

    }

    @Override
    public void press() {

    }

    @Override
    public void unOverlap() {

    }
}
