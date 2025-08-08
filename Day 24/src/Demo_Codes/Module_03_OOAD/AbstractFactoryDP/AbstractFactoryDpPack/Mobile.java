package Demo_Codes.Module_03_OOAD.AbstractFactoryDP.AbstractFactoryDpPack;

public class Mobile {
    String desc;

    public Mobile(String model) {
        this.desc = model;
    }

    public void getDesc() {
        System.out.println(this.desc);
    }
}