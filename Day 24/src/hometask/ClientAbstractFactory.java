package hometask;

public class ClientAbstractFactory {
    public static void main(String[] args) {
        Mobile m1 = MobileStore.getMobile("Apple", "iphone16");
        m1.getDesc();

        Mobile m2 = MobileStore.getMobile("Samsung", "S24");
        m2.getDesc();

        Mobile m3 = MobileStore.getMobile("OnePlus", "OnePlus12");
        m3.getDesc();

        Mobile m4 = MobileStore.getMobile("Apple", "iphone20"); // invalid
        m4.getDesc();
    }
}
