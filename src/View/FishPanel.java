package View;

import Model.Fish.Fish;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Evan Otero
 * 12/2/16
 */

@SuppressWarnings("serial")
public class FishPanel extends JPanel {
    private final Collection<FTViewObserver> observers = new ArrayList<>();
    private Collection<Fish> fishes = new ArrayList<>();

    public FishPanel() {
        setBackground(Color.blue);
        addComponentListener(new ComponentAdapter() {
            public void componentResized(ComponentEvent e){
                notifyObserversPanelResize();
            }
        });
    }

    public void addObserver(FTViewObserver o) {
        observers.add(o);
    }

    public void updateGraphics(Collection<Fish> fishes) {
        this.fishes = fishes;
        repaint();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Fish f : fishes)
            f.display(this, g);
    }

    public void newFish(String text) {
        notifyObserversNewFish(text);
    }

    public void toggleSuspend() {
        notifyObserversSuspend();
    }

    private void notifyObserversNewFish(String text) {
        for (FTViewObserver o : observers)
            o.newFish(text);
    }

    private void notifyObserversPanelResize() {
        for (FTViewObserver o : observers)
            o.setSize(getSize());
    }

    private void notifyObserversSuspend() {
        observers.forEach(FTViewObserver::startStopPressed);
    }
}