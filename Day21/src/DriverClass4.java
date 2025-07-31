// Low-level module
class Clothes {
    void seeRating() {
        System.out.println("Clothes rating shown");
    }

    void viewSample() {
        System.out.println("Viewing clothes sample");
    }
}

// Another low-level module (new customer request)
class Books1 {
    void seeRating() {
        System.out.println("Book rating shown");
    }

    void readSample() {
        System.out.println("Reading book sample");
    }
}

// High-level module that violates DIP
class Cupboard {
    Clothes cobj;
    Books1 bobj;

    void addClothes(Clothes cobj) {
        this.cobj = cobj;
    }

    void addBooks1(Books1 bobj) {
        this.bobj = bobj;
    }

    void customizeClothes() {
        System.out.println("Customizing clothes:");
        cobj.viewSample();
        cobj.seeRating();
    }

    void customizeBooks1() {
        System.out.println("Customizing Books1:");
        bobj.readSample();
        bobj.seeRating();
    }
}

// Main class with main method
public class DriverClass4 {
    public static void main(String[] args) {
        Cupboard cupboard = new Cupboard();

        // Adding and customizing clothes
        Clothes clothes = new Clothes();
        cupboard.addClothes(clothes);
        cupboard.customizeClothes();

        // Adding and customizing Books1
        Books1 Books1 = new Books1();
        cupboard.addBooks1(Books1);
        cupboard.customizeBooks1();
    }
}
