import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> items;

    // Constructor
    public Cart() {
        items = new ArrayList<>();
    }

    // Methods
    public void addItem(Product product) {
        items.add(product);
    }

    public void removeItem(Product product) {
        items.remove(product);
    }

    public double calculateTotalPrice() {
        double totalPrice = 0;
        for (Product item : items) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }
}
