/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.kunavich.task6.view;


import by.kunavich.task6.model.Book;

/**
 *
 * @author Lord
 */
public class ConcoleResultPrinter implements ResultPrinter{

    @Override
    public void printResult(Book book) {
        System.out.println(book.toString());

    }
}
