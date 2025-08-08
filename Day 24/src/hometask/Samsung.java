package hometask;

import java.util.Objects;

public class Samsung {
    private Samsung() {
        // Prevent instantiation
    }

    public static Mobile getMobile(String model) {
        if (Objects.equals(model, "S24")) {
            return new Mobile("Here is your Samsung S24");
        } else if (Objects.equals(model, "S24Ultra")) {
            return new Mobile("Here is your Samsung S24 Ultra");
        }
        return new NoMobile();
    }
}
