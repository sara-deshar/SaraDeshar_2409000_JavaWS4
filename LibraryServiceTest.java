package w4;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class LibraryServiceTest {

    private LibraryService libraryService;

    @BeforeEach
    public void setUp() {
        libraryService = new LibraryService();
        System.out.println("LibraryService object initialized.");
    }

    @AfterEach
    public void tearDown() {
        System.out.println("Test completed, resetting state.");
    }

    @BeforeAll
    public static void beforeClass() {
        System.out.println("Starting LibraryService tests...");
    }

    @AfterAll
    public static void afterClass() {
        System.out.println("All LibraryService tests completed.");
    }

    @Test
    public void testAddAndSearchBook() {
        libraryService.addBook("Java Programming");
        assertTrue(libraryService.searchBook("Java Programming"), "The book 'Java Programming' should be found.");
        assertFalse(libraryService.searchBook("Python Programming"), "The book 'Python Programming' should not be found.");
    }

    @Test
    public void testAddMultipleBooks() {
        libraryService.addBook("Java Programming");
        libraryService.addBook("C++ Programming");
        assertTrue(libraryService.searchBook("Java Programming"), "The book 'Java Programming' should be found.");
        assertTrue(libraryService.searchBook("C++ Programming"), "The book 'C++ Programming' should be found.");
    }

    @Test
    public void testSearchInEmptyLibrary() {
        // Search for a book in an empty library
        assertFalse(libraryService.searchBook("Java Programming"), "The book 'Java Programming' should not be found in an empty library.");
    }
}

