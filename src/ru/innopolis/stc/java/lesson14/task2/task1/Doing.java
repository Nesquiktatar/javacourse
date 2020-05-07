package ru.innopolis.stc.java.lesson14.task2.task1;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.*;

public class Doing {

   static Scanner inputScanner = new Scanner(System.in);

    private final static Logger logr = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    public static int money = 0;

    public static void main(String[] args) {

        LogManager.getLogManager().reset();
        logr.setLevel(Level.ALL);

        try {
            FileHandler fh = new FileHandler("VenedictMachine.log",true);
            fh.setLevel(Level.ALL);
            fh.setFormatter(new SimpleFormatter());
            logr.addHandler(fh);
        }catch (IOException e){
            logr.log(Level.SEVERE,"File logger is not working",e);
        }
        System.out.println("Меню : ");
        System.out.println(Arrays.toString(Menu.values()));
        System.out.println();
        System.out.print(Menu.SPRITE + " ");
        System.out.println(Menu.SPRITE.getPrice() + " рублей");
        System.out.print(Menu.FANTA + " ");
        System.out.println(Menu.FANTA.getPrice() + " рублей");
        System.out.print(Menu.MIRINDA + " ");
        System.out.println(Menu.MIRINDA.getPrice() + " рублей");
        System.out.print(Menu.WATER + " ");
        System.out.println(Menu.WATER.getPrice() + " рублей");
        System.out.print(Menu.JUICE + " ");
        System.out.println(Menu.JUICE.getPrice() + " рублей");
        System.out.println();

        System.out.println("Выберите один из напитков.\n Если хотите завршить покупку наберите \"Завершить покупку\"");
       while (inputScanner.hasNext()) {
           System.out.println("first");
           String usernameDrink;
         //  System.out.println("Выберите один из напитков.\n Если хотите завршить покупку наберите \"Завершить покупку\"");
           usernameDrink = inputScanner.nextLine();
           if ("Завершить покупку".equals(usernameDrink)) {
               break;
           }
           logr.log(Level.CONFIG, "Пользователь выбрал напиток: " + usernameDrink);

           Doing starter = new Doing();

           try {
               switch (usernameDrink) {
                   case ("SPRITE"):
                       starter.inc(50);
                       break;
                   case ("FANTA"):
                       starter.inc(60);
                       break;
                   case ("MIRINDA"):
                       starter.inc(70);
                       break;
                   case ("WATER"):
                       starter.inc(40);
                       break;
                   case ("JUICE"):
                       starter.inc(100);
                       break;
                   default:
                       throw new Exception();
               }
           } catch (Exception e) {
               logr.log(Level.SEVERE, "Пользователь НЕ выбрал напиток из списка.");
               System.out.println("Пожалуйста выберите напиток из меню.");
           }

       }
        System.out.println();
    }

    public void inc(int count) throws InterruptedException {
        money -= count;

        int userMoney;
        System.out.println("Сколько денег вы хотите положить на баланс?");
        userMoney = inputScanner.nextInt();
        logr.log(Level.CONFIG,"Пользователь внес денег: " + userMoney);

        money += userMoney;

        if (money >= 0)
            System.out.println("У вас осталось : " + money + " рублей. \nВозмьите ваш напиток "); // как добавить имя напитка?
        else{
            logr.log(Level.WARNING,"Количество денег меньше нуля.");
            System.out.println("У вас не хватает:" + Math.abs(money) + " рублей\nПожалуйсте выберите другой напиток или пополните баланс.");}
        Thread.sleep(100);

    }

}