package by.kunavich.task6.data.dao;

import by.kunavich.task6.data.BookField;
import by.kunavich.task6.data.DataException;
import by.kunavich.task6.data.comparator.ComparatorFactory;
import by.kunavich.task6.data.specification.Specification;
import by.kunavich.task6.data.specification.SpecificationFactory;
import by.kunavich.task6.model.Book;

import java.util.*;


public class BookDAO implements Dao<Book>{

    private List<Book> books = new ArrayList<>();
    private SpecificationFactory specFactory = new SpecificationFactory();
    private ComparatorFactory compFactory = new ComparatorFactory();

    @Override
    public Book get(int id) {
        return books.get(id);
    }

    @Override
    public List getAll() {
        return books;
    }

    @Override
    public void add(Book book) throws DataException {
        if (!books.contains(book)) {
            books.add(book);
        }
        else {
            throw new DataException("DAO alredy have this book");

        }


    }

    @Override
    public void add(List<Book> t) throws DataException {
        for (Book book:t) {
            this.add(book);
        }
    }

    @Override
    public Book findByTag(BookField field,String value) {
        Specification specification =specFactory.create(field);
        return specification.find(books,value);

    }

    @Override
    public void remove(Book book) throws DataException {
        if (books.contains(book)) {
            books.remove(book);
        }
        else {
            throw new DataException("DAO alredy have this book");

        }

    }

    @Override
    public List<Book> sortByTag(BookField field) {
        Comparator comparator = compFactory.create(field);
        Collections.sort(books, comparator);

        return books;
    }


}
