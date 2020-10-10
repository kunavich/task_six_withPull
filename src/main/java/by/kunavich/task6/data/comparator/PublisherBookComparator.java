package by.kunavich.task6.data.comparator;

import by.kunavich.task6.model.Book;

import java.util.Comparator;

public class PublisherBookComparator implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        String firstPub=o1.getPublisher();
        String secondPub=o2.getPublisher();
        return firstPub.compareTo(secondPub);
    }
}
