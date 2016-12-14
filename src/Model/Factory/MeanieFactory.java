package Model.Factory;

import Model.Fish.Fish;
import Model.Fish.MeanFish;
import Model.MovementStyle.MovementStyle;
import Model.MovementStyle.OscillatingMovement;

/**
 * Created by Evan Otero
 * 12/2/16
 */

public class MeanieFactory extends FishFactory {
    public Fish create() {
        MovementStyle ms = new OscillatingMovement(8, 10);
        return new MeanFish(ms);
    }
}
