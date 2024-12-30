package w4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Q6Test {
    private Q6 inventory;

    @BeforeEach
    public void setUp() {
        inventory = new Q6();
        inventory.addProduct("Laptop", 10);
        inventory.addProduct("Mouse", 50);
    }

    @Test
    public void testIsProductAvailable_EnoughStock() {
        // Test when there is enough stock
        assertTrue(inventory.isProductAvailable("Laptop", 5), "Laptop stock should be sufficient for quantity 5.");
    }

    @Test
    public void testIsProductAvailable_NotEnoughStock() {
        // Test when requested quantity exceeds stock
        assertFalse(inventory.isProductAvailable("Laptop", 15), "Laptop stock should not be sufficient for quantity 15.");
    }

    @Test
    public void testIsProductAvailable_ProductNotInStock() {
        // Test when product is not in inventory
        assertFalse(inventory.isProductAvailable("Keyboard", 1), "Keyboard should not be available in stock.");
    }

    @Test
    public void testAddProductUpdatesStock() {
        // Test that adding products updates the stock correctly
        inventory.addProduct("Laptop", 5);
        assertEquals(15, inventory.getProductStock("Laptop"), "Laptop stock should be updated to 15.");
    }

    @Test
    public void testGetProductStock() {
        // Test getting the stock of an existing product
        assertEquals(10, inventory.getProductStock("Laptop"), "Laptop stock should be 10.");
        // Test getting the stock of a non-existent product
        assertEquals(0, inventory.getProductStock("Keyboard"), "Keyboard stock should be 0.");
    }
}

