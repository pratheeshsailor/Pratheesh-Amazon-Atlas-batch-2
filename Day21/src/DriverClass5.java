interface IProduct {
    void seeReviews();
    void getSample();
}

class Clothes2 implements IProduct {
    @Override
    public void seeReviews() {
        System.out.println("Showing reviews for Clothes2...");
    }

    @Override
    public void getSample() {
        System.out.println("Showing Clothes2 sample...");
    }
}

class Books implements IProduct {
    @Override
    public void seeReviews() {
        System.out.println("Showing reviews for Books...");
    }

    @Override
    public void getSample() {
        System.out.println("Reading book sample...");
    }
}

class Cupboard2 {
    private IProduct product;

    public void addProduct(IProduct product) {
        this.product = product;
    }

    public void customizeProduct() {
        product.getSample();
        product.seeReviews();
    }
}

public class DriverClass5 {
    public static void main(String[] args) {
        Cupboard2 Cupboard2 = new Cupboard2();

        IProduct Clothes2 = new Clothes2();
        Cupboard2.addProduct(Clothes2);
        System.out.println("=== Clothes2 ===");
        Cupboard2.customizeProduct();

        IProduct books = new Books();
        Cupboard2.addProduct(books);
        System.out.println("=== Books ===");
        Cupboard2.customizeProduct();
    }
}
