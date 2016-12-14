package Main;

import Controller.FishCounterController;
import Controller.FishTankController;
import Model.FishTankModel;
import View.FishCounterView;
import View.FishTankView;

import javax.swing.Timer;

/**
 * Created by Evan Otero
 * 11/30/16
 */

public class FishTank {
    public static void main(String[] args) {
        FishTankModel ftModel = new FishTankModel();
        FishTankView ftView = new FishTankView();
        FishTankController ftC = new FishTankController(ftModel, ftView);
        FishCounterView fcView = new FishCounterView();
        FishCounterController fcC = new FishCounterController(ftModel, fcView);

        Timer t1 = new Timer(100, ftModel);     // fish animation timer
        //Timer t2 = new Timer(500, fcC);        // counter blinking timer
        t1.start(); //t2.start();                 //do the animation forever
    }
}