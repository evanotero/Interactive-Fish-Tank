package Model;

import Model.Fish.Fish;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Evan Otero
 * 11/30/16
 */

public class FishTankModel implements ActionListener {
    private final Collection<FTModelObserver> observers = new ArrayList<>();
    private final Collection<Fish> fishes = new ArrayList<>();
    private boolean suspended = false;
    private Dimension tankSize = new Dimension(650, 400);

    // Called by the timer
    public void actionPerformed(ActionEvent e) {
        tick();
    }

    public void addFish(Fish f) {
        fishes.add(f);
        notifyObserversUpdate();
    }

    public void setTankSize(Dimension tankSize) {
        this.tankSize = tankSize;
    }

    public void toggleSuspend() {
        suspended = !suspended;
        notifyObserversSuspended();
    }

    public void tick() {
        if (!suspended) {
            for (Fish f : fishes)
                f.move(tankSize);
            notifyObserversUpdate();
        }
    }

    public void addObserver(FTModelObserver o) {
        observers.add(o);
    }

    private void notifyObserversUpdate() {
        for (FTModelObserver o : observers)
            o.update(fishes);
    }

    private void notifyObserversSuspended() {
        for (FTModelObserver o : observers)
            o.isSuspended(suspended);
    }
}
