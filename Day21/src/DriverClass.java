abstract class BirdsThatFly {
    abstract void fly();
}

abstract class BirdsThatDontFly {
    abstract void speciality();
}

class Eagle extends BirdsThatFly {
    @Override
    public void fly() {
        System.out.println("Eagles fly");
    }
}

class Ostrich extends BirdsThatDontFly {
    @Override
    public void speciality() {
        System.out.println("It lays big eggs");
    }
}

public class DriverClass {
    public static void main(String[] args) {
        BirdsThatFly eagle = new Eagle();
        eagle.fly();

        BirdsThatDontFly ostrich = new Ostrich();
        ostrich.speciality();
    }
}
