package Demo_Codes.Module_03_OOAD.AbstractFactoryDP.AbstractFactoryDpPack;

public class ClientAbstractFactory {
    public static void main(String[] args) {
        Mobile mObj = MobileStore.getMobile("Apple", "iphone16");
        mObj.getDesc();
        System.out.println("...");
    }
}