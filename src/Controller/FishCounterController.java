package Controller;

import Model.FTModelObserver;
import Model.Fish.Fish;
import Model.FishTankModel;
import View.FishCounterView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collection;

/**
 * Created by Evan Otero
 * 12/2/16
 */

public class FishCounterController implements FTModelObserver, ActionListener {
    private FishTankModel model;
    private FishCounterView view;

    public FishCounterController(FishTankModel model, FishCounterView view) {
        this.model = model;
        this.view = view;
        model.addObserver(this);
    }

    public void update(Collection<Fish> fishes) {
        view.updateCounter(fishes.size());
    }

    // Called by the timer
    public void actionPerformed(ActionEvent e) {
        view.toggleCounterVisible();
    }

    public void isSuspended(boolean b) { }
}
