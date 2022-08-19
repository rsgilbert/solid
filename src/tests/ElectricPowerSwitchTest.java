
import good.dependencyinversion.highlevel.ElectricPowerSwitch;
import good.dependencyinversion.highlevel.Switch;
import good.dependencyinversion.highlevel.Switchable;
import good.dependencyinversion.lowlevel.LightBulb;
import org.junit.gen5.api.Test;

public class ElectricPowerSwitchTest {

    @Test
    public void testPress() throws Exception {
        Switchable lightBulb = new LightBulb();
        Switch electricSwitch = new ElectricPowerSwitch(lightBulb);
        electricSwitch.press();
    }
}
