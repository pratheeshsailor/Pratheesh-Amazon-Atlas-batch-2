// Abstraction
interface SwitchOnOff {
    void turnOn();
    void turnOff();
}

// Concrete class: LightBulb2 implements the interface
class LightBulb2 implements SwitchOnOff {
    @Override
    public void turnOn() {
        System.out.println("Light turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Light is off");
    }
}

// High-level module: depends on abstraction (SwitchOnOff), not on LightBulb2 directly
class Switch {
    private SwitchOnOff device;

    public Switch(SwitchOnOff device) {
        this.device = device;
    }

    public void operate() {
        device.turnOn();
    }
}

// Main class
public class DIP {
    public static void main(String[] args) {
        SwitchOnOff lbulbobj = new LightBulb2();  // depends on interface
        Switch lightSwitch = new Switch(lbulbobj);
        lightSwitch.operate();  // Output: Light turned on
    }
}
