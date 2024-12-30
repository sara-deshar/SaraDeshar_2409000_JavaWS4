package w4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {

    @Test
    public void testProductAssertions() {
        Product product = new Product("Laptop", 500.0, 2);

        assertAll(
            () -> assertNotNull(product.getName(), "Product name should not be null"),
            () -> assertTrue(product.getPrice() > 0, "Product price should be positive"),
            () -> assertTrue(product.isAffordable(1000.0), "Product should be affordable with a budget of 1000.0"),
            () -> assertFalse(product.isAffordable(500.0), "Product should not be affordable with a budget of 500.0")
        );
    }
}

