package bad.liskov;

public class Bicycle extends TransportationDevice {
    /**
     * This is bad code. A bicycle does not have an engine
     * so this method startEngine() can not be applied to it.
     * This is a violation of Liskov Substitution principlr..
     */
    @Override
    public void startEngine() {

    }
}
