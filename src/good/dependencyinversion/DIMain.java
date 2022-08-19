package good.dependencyinversion;

import good.dependencyinversion.highlevel.ElectricPowerSwitch;
import good.dependencyinversion.highlevel.Switch;
import good.dependencyinversion.highlevel.Switchable;
import good.dependencyinversion.lowlevel.Fan;
import good.dependencyinversion.lowlevel.LightBulb;

public class DIMain {
    public static void main(String[] args) {
        Switchable lightBulb = new LightBulb();
        Switch electricSwitch = new ElectricPowerSwitch(lightBulb);
        electricSwitch.press();
        electricSwitch.press();

        System.out.println("** Fan");
        Switchable fan = new Fan();
        Switch electricSwitch2 = new ElectricPowerSwitch(fan);
        electricSwitch2.press();
        electricSwitch2.press();
        System.out.println("Fan isOn: " + electricSwitch2.isOn());
        electricSwitch2.press();
    }
}
