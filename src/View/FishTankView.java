package View;

import Model.Fish.Fish;

import java.util.Collection;

/**
 * Created by Evan Otero
 * 11/30/16
 */

public class FishTankView {
    private FishFrame frame;

    public FishTankView() {
        this.frame = new FishFrame();
    }

    public void addObserver(FTViewObserver o) {
        frame.addObserver(o);
    }

    public void setStartStopText(String s) {
        frame.setStartStopText(s);
    }

    public void display(Collection<Fish> fishes) {
        frame.updateGraphics(fishes);
    }
}
