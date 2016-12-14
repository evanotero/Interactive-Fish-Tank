package View;

import javax.swing.*;

/**
 * Created by Evan Otero
 * 12/2/16
 */

@SuppressWarnings("serial")
public class FishMenuBar extends JMenuBar {
    private JMenuItem startstop = new JMenuItem("Stop");

    public FishMenuBar(FishPanel fp) {  // set up the menu bar
        JMenu animation = new JMenu("Animation");
        add(animation);
        animation.add(startstop);
        startstop.addActionListener(e->fp.toggleSuspend());
        JMenu newmenu = new JMenu("New Fish");
        add(newmenu);
        JMenuItem angelfish = new JMenuItem("Angel Fish");
        newmenu.add(angelfish);
        angelfish.addActionListener(e->fp.newFish(angelfish.getText()));
        JMenuItem meanie = new JMenuItem("Mean Fish");
        newmenu.add(meanie);
        meanie.addActionListener(e->fp.newFish(meanie.getText()));
        JMenuItem octopus = new JMenuItem("Octopus");
        newmenu.add(octopus);
        octopus.addActionListener(e->fp.newFish(octopus.getText()));
    }

    public void setStartStopText(String s) {
        startstop.setText(s);
    }
}
