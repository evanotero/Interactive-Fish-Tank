package Model.Factory;

import Model.Fish.AngelFish;
import Model.Fish.Fish;
import Model.MovementStyle.MovementStyle;
import Model.MovementStyle.UpDownMovement;

/**
 * Created by Evan Otero
 * 12/2/16
 */

public class AngelFishFactory extends FishFactory {
    public Fish create() {
        // each new fish has random speeds from 1 to 8
        int xspeed = 1 + (int)(8 * Math.random());
        int yspeed = 1 + (int)(8 * Math.random());
        MovementStyle ms = new UpDownMovement(xspeed, yspeed);
        return new AngelFish(ms);
    }
}
