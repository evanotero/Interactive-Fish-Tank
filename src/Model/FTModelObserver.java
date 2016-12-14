package Model;

import Model.Fish.Fish;

import java.util.Collection;

/**
 * Created by Evan Otero
 * 11/30/16
 */

public interface FTModelObserver {
    void update(Collection<Fish> fishes);
    void isSuspended(boolean b);
}
