package by.kunavich.task6.data.specification;

import by.kunavich.task6.data.comparator.AuthorBookComparator;
import by.kunavich.task6.model.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class LengthBookSpecificationTest {

    @Test
    public void findTest()
    {
        //given
        List<Book> books= new ArrayList<>();
        Book one = new Book("NINE PRINCES IN AMBER","ZELAZNY","ROSMAN",132);
        Book two = new Book("Lir King","Shekspir","HERPER COLINES",43);
        books.add(one);
        books.add(two);
        LengthBookSpecification lengthBookSpecification = new LengthBookSpecification();

        Book actual = two;
        //whenn
        Book answer =lengthBookSpecification.find(books,"43");
        //then
        Assert.assertEquals(answer,actual);
    }
}
