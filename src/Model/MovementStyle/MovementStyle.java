package Model.MovementStyle;

/**
 * Created by Evan Otero
 * 12/2/16
 */

public interface MovementStyle {
    int xspeed();
    int yspeed();
    void changeXdirection();
    void changeYdirection();
    int xDirectionChangeFreq(); // in tenths of a percent
    int yDirectionChangeFreq(); // in tenths of a percent
}
