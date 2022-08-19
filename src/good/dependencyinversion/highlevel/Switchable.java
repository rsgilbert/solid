package good.dependencyinversion.highlevel;

/**
 * An abstraction in form of an interface that both
 * the low level modules (Light Bulb) and high level modules
 * (ElectricPowerSwitch) will belong to.
 * This abstraction belongs to the package of the high level module.
 */
public interface Switchable {
    void turnOn();
    void turnOff();
}
