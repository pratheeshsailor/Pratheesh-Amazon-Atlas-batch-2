package hometask;

import java.util.Objects;

public class MobileStore {
    private MobileStore() {
        System.out.println("Hello, welcome to the world of Mobile");
    }

    public static Mobile getMobile(String brand, String model) {
        if (Objects.equals(brand, "Apple")) {
            System.out.println("Here are your Apple Models");
            return Apple.getMobile(model);
        } else if (Objects.equals(brand, "Samsung")) {
            System.out.println("Here are your Samsung Models");
            return Samsung.getMobile(model);
        } else if (Objects.equals(brand, "OnePlus")) {
            System.out.println("Here are your OnePlus Models");
            return OnePlus.getMobile(model);
        }
        return new NoMobile();
    }
}
