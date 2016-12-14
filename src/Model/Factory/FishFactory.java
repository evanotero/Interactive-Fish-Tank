package Model.Factory;

import Model.Fish.Fish;

/**
 * Created by Evan Otero
 * 12/2/16
 */

public abstract class FishFactory {
    public static FishFactory getFactory(String s) {
        switch (s) {
            case "Angel Fish":
                return new AngelFishFactory();
            case "Octopus":
                return new OctopusFactory();
            case "Mean Fish":
                return new MeanieFactory();
            default:
                return null;
        }
    }

    public abstract Fish create();
}
