package by.kunavich.task6.data.comparator;

import by.kunavich.task6.model.Book;

import java.util.Comparator;

public class AuthorBookComparator implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        String firstAut=o1.getAutor();
        String secondAut=o2.getAutor();
        return firstAut.compareTo(secondAut);
    }
}
