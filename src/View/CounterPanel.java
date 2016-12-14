package View;

import javax.swing.*;


/**
 * Created by Evan Otero
 * 12/2/16
 */

public class CounterPanel extends JPanel {
    private JLabel lblPart1 = new JLabel("The aquarium has "),
            lblPart2 = new JLabel(" fish.");
    private JTextField fishSize = new JTextField("0", 3);

    public CounterPanel() {
        add(lblPart1);
        add(fishSize);
        add(lblPart2);
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
    }

    public void updateCounter(int size) {
        fishSize.setText(Integer.toString(size));
    }

    public void toggleCounterVisible() {
        fishSize.setVisible(!fishSize.isVisible());
    }
}
