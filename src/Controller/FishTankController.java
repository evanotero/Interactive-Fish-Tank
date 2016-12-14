package Controller;

import Model.FTModelObserver;
import Model.Fish.Fish;
import Model.Factory.FishFactory;
import Model.FishTankModel;
import View.FTViewObserver;
import View.FishTankView;

import java.awt.*;
import java.util.Collection;

/**
 * Created by Evan Otero
 * 11/30/16
 */

public class FishTankController implements FTModelObserver, FTViewObserver {
    private FishTankModel model;
    private FishTankView view;

    public FishTankController(FishTankModel model, FishTankView view) {
        this.model = model;
        this.view = view;
        model.addObserver(this);
        view.addObserver(this);
    }

    public void newFish(String ftype) {
        FishFactory ff = FishFactory.getFactory(ftype);
        Fish f = ff.create();
        model.addFish(f);
    }

    public void startStopPressed() {
        model.toggleSuspend();
    }

    public void setSize(Dimension d) {
        model.setTankSize(d);
    }

    public void update(Collection<Fish> fishes) {
        view.display(fishes);
    }

    public void isSuspended(boolean b) {
        if (b)
            view.setStartStopText("Start");
        else
            view.setStartStopText("Stop");
    }
}
