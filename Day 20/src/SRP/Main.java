package SRP;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Clean Code", "Robert C. Martin", 500);

        BookFormatter formatter = new BookFormatter();
        BookPricing pricing = new BookPricing();

        System.out.println(formatter.getFormattedTitle(book)); // Output: Title: CLEAN CODE
        System.out.println(formatter.getFormattedAuthor(book)); // Output: Author: Robert C. Martin

        double discountedPrice = pricing.calculateDiscountedPrice(book, 0.2); // 20% off
        System.out.println("Discounted Price: ₹" + discountedPrice); // ₹400.0
    }
}
