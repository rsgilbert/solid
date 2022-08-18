package good.liskov;

public class DevicesWithEngines extends TransportationDevice {
    private Engine engine;

    @Override
    public Engine getEngine() {
        return engine;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
