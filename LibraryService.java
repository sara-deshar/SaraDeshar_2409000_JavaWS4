package w4;

import java.util.ArrayList;
import java.util.List;

public class LibraryService {

    private List<String> books;

    public LibraryService() {
        books = new ArrayList<>();
    }

    public void addBook(String title) {
        books.add(title);
    }

    public boolean searchBook(String title) {
        return books.contains(title);
    }

    public List<String> getBooks() {
        return books;
    }
}

