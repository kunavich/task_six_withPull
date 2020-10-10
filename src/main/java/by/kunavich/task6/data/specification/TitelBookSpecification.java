package by.kunavich.task6.data.specification;

import by.kunavich.task6.model.Book;

import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class TitelBookSpecification implements Specification<String> {


    @Override
    public Book find(List<Book> books, String value) {
        for (Book book:books) {
            if(book.getTitel().equals(value)) {
                return book;
            }
        }
        return null;
    }
}
