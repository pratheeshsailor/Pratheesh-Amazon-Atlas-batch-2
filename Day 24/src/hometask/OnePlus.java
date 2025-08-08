package hometask;

import java.util.Objects; // ✅ add this

public class OnePlus {
    private OnePlus() {
        // Prevent instantiation
    }

    public static Mobile getMobile(String model) {
        if (Objects.equals(model, "OnePlus12")) {
            return new Mobile("Here is your OnePlus 12");
        } else if (Objects.equals(model, "OnePlus12R")) {
            return new Mobile("Here is your OnePlus 12R");
        }
        return new NoMobile();
    }
}
