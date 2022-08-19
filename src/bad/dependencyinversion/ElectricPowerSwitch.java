package bad.dependencyinversion;

/**
 * High level module.
 */
public class ElectricPowerSwitch {
    private LightBulb lightBulb;
    private boolean on;

    // Our high level module is directly dependent on the low level light bulb class
    public ElectricPowerSwitch(LightBulb lightBulb) {
        this.lightBulb = lightBulb;
        this.on = false;
    }

    public boolean isOn() {
        return on;
    }

    public void press() {
        if(isOn()) {
            lightBulb.turnOff();
        }
        else {
            lightBulb.turnOn();
        }
        this.on = !this.on;
    }
}
