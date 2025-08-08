package Task04_Adapter_Design;

public class DellLaptop {
    private ILaptopTarget powerSource;

    public DellLaptop(ILaptopTarget powerSource) {
        this.powerSource = powerSource;
    }

    public void charge() {
        powerSource.charge();
    }

    public void removeCharge() {
        powerSource.removeCharge();
    }
}