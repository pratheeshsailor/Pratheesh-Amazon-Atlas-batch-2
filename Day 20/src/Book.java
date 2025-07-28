public class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Presentation logic mixed in — violates SRP
    public String getFormattedTitle() {
        return "Title: " + title.toUpperCase();
    }

    // Business logic mixed in — violates SRP
    public double calculateDiscountedPrice(double discountPercentage) {
        return price * (1 - discountPercentage);
    }

    public static void main(String[] args) {
        Book book = new Book("Clean Code", "Robert C. Martin", 500.0);

        System.out.println(book.getFormattedTitle());
        double discountedPrice = book.calculateDiscountedPrice(0.10); // 10% discount
        System.out.println("Discounted Price: ₹" + discountedPrice);
    }
}
