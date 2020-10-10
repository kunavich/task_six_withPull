package by.kunavich.task6.data.comparator;

import by.kunavich.task6.model.Book;

import java.util.Comparator;

public class LengthBookComparator implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        Integer firstLn =o1.getLength();
        int secondLn=o2.getLength();
        return firstLn.compareTo(secondLn);
    }
}
