package by.kunavich.task6.data.comparator;

import by.kunavich.task6.model.Book;

import java.util.Comparator;

public class TitelBookComparator implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        String firstNum=o1.getTitel();
        String secondNum=o2.getTitel();
        return firstNum.compareTo(secondNum);
    }
}
