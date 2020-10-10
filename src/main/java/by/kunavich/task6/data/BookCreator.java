package by.kunavich.task6.data;


import by.kunavich.task6.model.Book;

import java.util.List;

public class BookCreator {
    public Book create(String line) throws DataException {
        String[] strings = line.split("/");
        String titel=strings[0];
        String autor=strings[1];
        String publisher=strings[2];
        int length=Integer.parseInt(strings[3]);



        Book newBook=  new Book(titel,autor,publisher,length);
        return newBook;
    }

}
