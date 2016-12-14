package View;

import java.awt.*;

/**
 * Created by Evan Otero
 * 11/30/16
 */

public interface FTViewObserver {
    void newFish(String ftype);
    void startStopPressed();
    void setSize(Dimension d);
}
