package w4;

import java.util.HashMap;
import java.util.Map;

public class Q6 {
    private Map<String, Integer> productStock;

    public Q6() {
        this.productStock = new HashMap<>();
    }

    public void addProduct(String productName, int quantity) {
        productStock.put(productName, productStock.getOrDefault(productName, 0) + quantity);
    }

    public boolean isProductAvailable(String productName, int quantity) {
        int availableStock = productStock.getOrDefault(productName, 0);
        return availableStock >= quantity;
    }

    public int getProductStock(String productName) {
        return productStock.getOrDefault(productName, 0);
    }
}

