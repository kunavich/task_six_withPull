package by.kunavich.task6.data.specification;

import by.kunavich.task6.model.Book;

import java.util.List;

public interface Specification<T> {
    public Book find(List<Book> books , String value);
}
