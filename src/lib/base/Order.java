import java.util.List;

public class Order {
    private List<Product> products;
    private double totalPrice;
    private boolean isConfirmed;

    // Constructor
    public Order(List<Product> products) {
        this.products = products;
        this.totalPrice = calculateTotalPrice();
        this.isConfirmed = false;
    }

    // Methods
    private double calculateTotalPrice() {
        double totalPrice = 0;
        for (Product product : products) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }

    public void confirmOrder() {
        this.isConfirmed = true;
    }

    public boolean isConfirmed() {
        return isConfirmed;
    }
    
    public List<Product> getProducts() {
        return products;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}
