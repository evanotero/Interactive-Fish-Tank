package View;

import Model.Fish.Fish;

import javax.swing.*;
import java.util.Collection;

/**
 * Created by Evan Otero
 * 12/2/16
 */

@SuppressWarnings("serial")
public class FishFrame extends JFrame {
    private FishPanel panel;
    private FishMenuBar menuBar;

    public FishFrame() {
        setTitle("Model.Fish.Fish Tank");
        setSize(650, 400);
        setLocation(20, 20);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        panel = new FishPanel();
        menuBar = new FishMenuBar(panel);
        setJMenuBar(menuBar);
        getContentPane().add(panel);
        setVisible(true);
    }

    public void addObserver(FTViewObserver o) {
        panel.addObserver(o);
    }

    public void updateGraphics(Collection<Fish> fishes) {
        panel.updateGraphics(fishes);
    }

    public void setStartStopText(String s) {
        menuBar.setStartStopText(s);
    }
}