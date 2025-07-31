class Driver {
    private String name;

    public Driver(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Car2 {
    private Driver driver; // Aggregation

    public Car2(Driver driver) {
        this.driver = driver;
    }

    public Driver getDriver() {
        return driver;
    }
}

public class AggregationExample {
    public static void main(String[] args) {
        Driver driver = new Driver("John");
        Car2 myCar2 = new Car2(driver);

        System.out.println("Driver's name is " + myCar2.getDriver().getName());
    }
}
