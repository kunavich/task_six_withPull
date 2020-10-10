package by.kunavich.task6.data.specification;

import by.kunavich.task6.model.Book;

import java.util.List;
import java.util.Set;


public class PublisherBookSpecification  implements Specification<String>{


    @Override
    public Book find(List<Book> books, String value) {
        for (Book book:books) {
            if(book.getPublisher().equals(value)) {
                return book;
            }
        }
        return null;
    }
}
