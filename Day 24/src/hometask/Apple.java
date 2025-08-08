package hometask;

import java.util.Objects;

public class Apple {
    private Apple() {
        // Prevent instantiation
    }

    public static Mobile getMobile(String model) {
        if (Objects.equals(model, "iphone16")) {
            return new Mobile("Here is your iPhone 16");
        } else if (Objects.equals(model, "iphone16MaxPro")) {
            return new Mobile("Here is your iPhone 16 Max Pro");
        }
        return new NoMobile();
    }
}