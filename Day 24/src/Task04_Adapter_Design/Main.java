package Task04_Adapter_Design;

public class Main {
    public static void main(String[] args) {
        System.out.println("Adapter Method Design Pattern");

        IChargerAdaptee charger = new ChargerAdaptee();
        ILaptopTarget adapter = new PowerSocketAdapter(charger);
        DellLaptop dell = new DellLaptop(adapter);

        dell.charge();
        dell.removeCharge();
    }
}
