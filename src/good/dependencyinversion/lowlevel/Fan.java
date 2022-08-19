package good.dependencyinversion.lowlevel;

import good.dependencyinversion.highlevel.Switchable;

public class Fan implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("Fan: Making noise, bringing wind");
    }

    @Override
    public void turnOff() {
        System.out.println("Fan, coming to a stop");
    }
}
