package by.kunavich.task6.data.comparator;

import by.kunavich.task6.model.Book;
import org.junit.Assert;
import org.junit.Test;

public class AuthorBookComporatorTest {

    @Test
    public void compereTest()
    {
        //given
        Book one = new Book("NINE PRINCES IN AMBER","ZELAZNY","ROSMAN",132);
        Book two = new Book("Lir King","Shekspir","HERPER COLINES",43);
        AuthorBookComparator authorBookComparator = new AuthorBookComparator();

        int actual = 1;
        //whenn
        int answer =authorBookComparator.compare(one,two);
        //then
        Assert.assertTrue(answer >= actual);
    }
}
