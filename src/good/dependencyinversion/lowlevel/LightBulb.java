package good.dependencyinversion.lowlevel;

import good.dependencyinversion.highlevel.Switchable;

/**
 * Low level module
 */
public class LightBulb implements Switchable {
    public void turnOn(){
        System.out.println("LightBulb: Bulb turned on");
    }

    public void turnOff() {
        System.out.println("LightBulb: Bulb turned off");
    }
}
