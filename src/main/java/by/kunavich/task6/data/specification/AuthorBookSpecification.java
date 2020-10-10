package by.kunavich.task6.data.specification;

import by.kunavich.task6.model.Book;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class AuthorBookSpecification implements Specification<String>{


    @Override
    public Book find(List<Book> books, String value) {
        for (Book book:books) {
            if(book.getAutor().equals(value)) {
                return book;
            }
        }
        return null;
    }
}
