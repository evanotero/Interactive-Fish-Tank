package Model.Fish;

import Model.MovementStyle.MovementStyle;

import javax.swing.*;

/**
 * Created by Evan Otero
 * 12/2/16
 */

public class MeanFish extends Fish {
    private ImageIcon leftimage, rightimage;

    public MeanFish(MovementStyle ms) {
        leftimage  = new ImageIcon("./images/Lmeaniefish.gif");
        rightimage = new ImageIcon("./images/Rmeaniefish.gif");
        setMovementStyle(ms);
    }

    public ImageIcon leftImage() {
        return leftimage;
    }

    public ImageIcon rightImage() {
        return rightimage;
    }
}
