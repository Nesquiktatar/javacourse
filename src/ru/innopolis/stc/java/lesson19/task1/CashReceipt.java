package ru.innopolis.stc.java.lesson19.task1;
import java.io.*;
import java.util.Scanner;


public class CashReceipt {
        private static String productName;
        private static String price;
        private static String quantity;
        private static String result;

        public static void main(String[] args) {
            try (FileReader fr = new FileReader("C:\\Users\\iz965\\IdeaProjects\\JavaCourceHomework\\Main\\src\\ru\\innopolis\\stc\\java\\lesson19\\task1\\products.txt");
                 Scanner scanner = new Scanner(fr)) {
                productName = "Наименование";
                price = "Цена";
                result = "Стоимость";
                quantity = "Количество";
                System.out.printf("%-10s %15s %15s %15s", productName, quantity, price, result);
                System.out.println();
                while (scanner.hasNext()) {
                    int quantity = 0;
                    double price = 0;
                    double sum = 0;
                    String productName = null;
                    productName = scanner.next();
                    quantity = scanner.nextInt();
                    price = scanner.nextDouble();
                    sum = quantity * price;
                    System.out.printf("%-10s %17s %15s %15s\n", productName, quantity, price, sum);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

