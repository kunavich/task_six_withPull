package by.kunavich.task6.data.comparator;

import by.kunavich.task6.data.BookField;
import by.kunavich.task6.data.DataException;
import by.kunavich.task6.model.Book;

import java.util.Comparator;

public class ComparatorFactory {

    public Comparator<Book> create(BookField field)  {
        switch (field)
        {
            case TITEL:
                return new TitelBookComparator();
            case AUTHOR:
                return new AuthorBookComparator();
            case LENGTH:
                return new LengthBookComparator();
            case PUBLISHER:
                return new PublisherBookComparator();
            default:
                throw new IllegalArgumentException("wrong Book's field"+ field);
        }


    }
}
