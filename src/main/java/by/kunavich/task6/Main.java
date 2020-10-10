/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.kunavich.task6;

import by.kunavich.task6.data.BookCreator;
import by.kunavich.task6.data.BookField;
import by.kunavich.task6.data.DataException;
import by.kunavich.task6.data.dao.BookDAO;
import by.kunavich.task6.data.dataAcquirer.DataAcquirer;
import by.kunavich.task6.data.dataAcquirer.DataAcquirerFactory;
import by.kunavich.task6.model.Book;
import by.kunavich.task6.view.ConcoleResultPrinter;
import by.kunavich.task6.view.ResultPrinter;
import org.apache.log4j.xml.DOMConfigurator;


import org.apache.log4j.Logger;

import java.util.List;


/**
 *
 * @author Lord
 */


public class Main {
     static Logger LOGGER = Logger.getLogger(Main.class);

     public static void main(String[] args) {

         //DOMConfigurator is used to configure logger from xml configuration file
         DOMConfigurator.configure("log4j.xml");

         //Log in console in and log file
         LOGGER.info("start Log4j ");

         // get
         DataAcquirerFactory dataAcquirerFactory = new DataAcquirerFactory();
         DataAcquirer dataAcquirer = dataAcquirerFactory.getDataAcquirer("FILE");
         LOGGER.info("init DataAcquirer ");

         BookDAO bookDAO =new BookDAO();
         BookCreator bookCreator = new BookCreator();

         try {


             for (int i = 0; i < 5; i++) {
                 String string = dataAcquirer.getData();
                 Book book = bookCreator.create(string);
                 bookDAO.add(book);
             }
         }
         catch (DataException e)
         {
             LOGGER.error(e.getMessage(),e);
         }
         LOGGER.info("bookDAO create");
         //count
         List<Book> books = bookDAO.sortByTag(BookField.TITEL);
         LOGGER.info("books are sorted");
         Book findBook =bookDAO.findByTag(BookField.AUTHOR,"ZELAZNY" );
         LOGGER.info("book is found");
         //out
         ResultPrinter printer= new ConcoleResultPrinter();
         printer.printResult(findBook);
         LOGGER.info("surched book");
         LOGGER.info(findBook.toString());
         LOGGER.info("sorted books :");
         for (Book book:books) {

             printer.printResult(book);
             LOGGER.info(book.toString());
         }

         LOGGER.info("end of program and Log4j ");


    }
}
