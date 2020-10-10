/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.kunavich.task6.data.dataAcquirer;

import by.kunavich.task6.data.DataException;


import java.util.Scanner;

/**
 *
 * @author Lord
 */
public class ConsoleDataAcquirer implements DataAcquirer{

    @Override
    public String getData() throws DataException {
        System.out.println("Enter line");
        try (Scanner scanner = new Scanner(System.in)){
            String input =scanner.next();
            return input;
        }
    }
}
