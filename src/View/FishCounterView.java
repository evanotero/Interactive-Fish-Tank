package View;

/**
 * Created by Evan Otero
 * 12/2/16
 */

public class FishCounterView {
    private CounterFrame frame;

    public FishCounterView() {
        this.frame = new CounterFrame();
        frame.pack();
    }

    public void updateCounter(int size) {
        frame.updateCounter(size);
    }

    public void toggleCounterVisible() {
        frame.toggleCounterVisible();
    }
}
