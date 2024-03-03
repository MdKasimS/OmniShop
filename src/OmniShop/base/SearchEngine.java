import java.util.ArrayList;
import java.util.List;

public class SearchEngine {
    private List<Product> products;

    // Constructor
    public SearchEngine(List<Product> products) {
        this.products = products;
    }

    // Search products by name
    public List<Product> searchByName(String keyword) {
        List<Product> results = new ArrayList<>();
        for (Product product : products) {
            if (product.getName().toLowerCase().contains(keyword.toLowerCase())) {
                results.add(product);
            }
        }
        return results;
    }

    // Search products by category
    public List<Product> searchByCategory(String category) {
        List<Product> results = new ArrayList<>();
        for (Product product : products) {
            if (product.getCategory().equalsIgnoreCase(category)) {
                results.add(product);
            }
        }
        return results;
    }
}
