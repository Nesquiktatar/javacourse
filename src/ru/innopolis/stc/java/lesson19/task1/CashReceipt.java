package ru.innopolis.stc.java.lesson19.task1;

import java.io.*;
import java.util.*;


public class CashReceipt {

    public static void main(String[] args) {

        try (FileReader fr = new FileReader("C:\\Users\\iz965\\IdeaProjects\\JavaCourceHomework\\Main\\src" +
                "\\ru\\innopolis\\stc\\java\\lesson19\\task1\\products.txt");
             Scanner scanner = new Scanner(fr)) {
            String productName1 = "Наименование";
            String price1 = "Цена";
            String result = "Стоимость";
            String quantity1 = "Количество";
            String line = "============================================================";
            System.out.printf("%-10s %15s %15s %15s", productName1, quantity1, price1, result);
            System.out.println("\n" + line);
            double sumOfAll = 0.0;
            while (scanner.hasNext()) {
                int quantity = 0;
                double price = 0;
                double sum = 0;
                String productName = null;
                productName = scanner.next();
                quantity = scanner.nextInt();
                price = scanner.nextDouble();
                sum = quantity * price;
                sumOfAll +=sum;
                System.out.printf("%-10s %17s %15s %15s \n", productName, quantity, price, sum);
            }

            System.out.println(line);
            System.out.printf("%-10s %48s", "Итого", sumOfAll);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}


