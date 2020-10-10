package by.kunavich.task6.data.specification;

import by.kunavich.task6.model.Book;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class LengthBookSpecification implements Specification<Integer>{


    @Override
    public Book find(List<Book> books, String value) {

        for (Book book:books) {
            if(book.getLength().equals(Integer.parseInt(value))) {
                return book;
            }
        }
        return null;
    }
}
