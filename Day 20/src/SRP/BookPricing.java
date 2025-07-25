package SRP;

public class BookPricing {
    public double calculateDiscountedPrice(Book book, double discountPercentage) {
        return book.getPrice() * (1 - discountPercentage);
    }
}
