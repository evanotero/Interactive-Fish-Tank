package Model.Factory;

import Model.Fish.Fish;
import Model.MovementStyle.HorizontalMovement;
import Model.MovementStyle.MovementStyle;
import Model.Fish.Octopus;

/**
 * Created by Evan Otero
 * 12/2/16
 */

public class OctopusFactory extends FishFactory {
    public Fish create() {
        MovementStyle ms = new HorizontalMovement(1);
        return new Octopus(ms);
    }
}
