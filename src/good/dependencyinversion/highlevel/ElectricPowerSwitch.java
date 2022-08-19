package good.dependencyinversion.highlevel;

import good.dependencyinversion.lowlevel.LightBulb;

/**
 * High level module.
 * The Electric Power Switch is a Switch.
 * It switches on and off a switchable device.
 */
public class ElectricPowerSwitch implements Switch {
    private Switchable switchable;
    private boolean on;

    // Our high level module is now dependent on an abstraction in the high level module
    public ElectricPowerSwitch(Switchable switchable) {
        this.switchable = switchable;
        this.on = false;
    }

    public boolean isOn() {
        return on;
    }

    public void press() {
        if(isOn()) {
            switchable.turnOff();
        }
        else {
            switchable.turnOn();
        }
        this.on = !this.on;
    }
}
