class LightBulb {
    void turnOn() {
        System.out.println("Light turned on");
    }

    void turnOff() {
        System.out.println("Light is off");
    }
}

// DIP Violation: Switch directly depends on LightBulb
class Switch {
    LightBulb lbulbobj;

    Switch(LightBulb lbulbobj) {
        this.lbulbobj = lbulbobj;
    }

    void operate() {
        lbulbobj.turnOn();
    }

    public static void main(String[] args) {
        LightBulb lbulbobj = new LightBulb(); // tightly coupled
        Switch switchObj = new Switch(lbulbobj);
        switchObj.operate();
    }
}
