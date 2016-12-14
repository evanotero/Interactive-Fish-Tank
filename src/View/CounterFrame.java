package View;

import javax.swing.*;

/**
 * Created by Evan Otero
 * 12/2/16
 */

public class CounterFrame extends JFrame {
    private CounterPanel panel;

    public CounterFrame() {
        setTitle("Fish Counter");
        setLocation(700, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        panel = new CounterPanel();
        getContentPane().add(panel);
        setVisible(true);
    }

    public void updateCounter(int size) {
        panel.updateCounter(size);
    }

    public void toggleCounterVisible() {
        panel.toggleCounterVisible();
    }
}
