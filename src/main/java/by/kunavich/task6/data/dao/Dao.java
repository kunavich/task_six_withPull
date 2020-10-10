package by.kunavich.task6.data.dao;

import by.kunavich.task6.data.BookField;
import by.kunavich.task6.data.DataException;
import by.kunavich.task6.model.Book;

import java.util.List;
import java.util.Set;


public interface Dao<T> {

    T get(int id);

    List<T> getAll();

    void add(T t) throws DataException;
    void add(List<T> t) throws DataException;

    Book findByTag(BookField field, String value);

    void remove(T t) throws DataException;
    List<Book> sortByTag(BookField field);
}