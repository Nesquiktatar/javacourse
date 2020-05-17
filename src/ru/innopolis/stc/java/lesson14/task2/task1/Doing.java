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
            FileHandler fh = new FileHandler("VendingMachine.log",true);
            fh.setLevel(Level.ALL);
            fh.setFormatter(new SimpleFormatter());
            logr.addHandler(fh);
        }catch (IOException e){
            logr.log(Level.SEVERE,"File logger is not working",e);
        }
        System.out.println("Меню : ");
        System.out.println(Menu.SPRITE);
        System.out.println(Menu.FANTA);
        System.out.println(Menu.MIRINDA);
        System.out.println(Menu.WATER);
        System.out.println(Menu.JUICE);
        System.out.println();


       do {
           System.out.println("Выберите один из напитков по названию.\n Если хотите завершить покупку наберите \"quit\"");
           String usernameDrink;
           usernameDrink = inputScanner.next();
           logr.log(Level.CONFIG, "Пользователь выбрал напиток: " + usernameDrink);
           if ("quit".equals(usernameDrink)) {
               System.out.println("Выход из программы.");
               break; }

           try{
               Menu userChoice = Menu.valueOf(usernameDrink.toUpperCase());
               Doing starter = new Doing();
               starter.inc(userChoice.getPrice());
           }catch (IllegalArgumentException e){
               logr.log(Level.WARNING,"the specified enum type has\n" +
                       "no constant with the specified name, or the specified\n" +
                       "class object does not represent an enum type",e);
               System.out.println("Введеные вами данные не подходят, пожалуйста выберите напиток из меню.");
           }catch (NullPointerException e){
               logr.log(Level.WARNING,"Пользователь ничего не ввел. is null",e);
               System.out.println("Вы ничего не ввели, пожалуйства выберите напиток из меню.");
           }catch (InterruptedException e){
               logr.log(Level.WARNING," InterruptedException ",e);
               System.out.println("New exception");
           }
       }while (true);
        System.out.println();
    }

    public void inc(int count) throws InterruptedException {
        money -= count;

        int userMoney;
        System.out.println("Сколько денег вы хотите положить на баланс?");
        userMoney = inputScanner.nextInt();
        logr.log(Level.CONFIG,"Пользователь внес денег: " + userMoney);

        money += userMoney;

        if (money >= 0){
            logr.log(Level.INFO,"Баланс пользователя положительный. Выдача напитка.");
            System.out.println("У вас осталось : " + money + " рублей. \nВозмьите ваш напиток \n");

        } // как добавить имя напитка?
        else{
            logr.log(Level.WARNING,"Количество денег меньше нуля. Пользователь не получил напиток.");
            System.out.println("У вас не хватает:" + Math.abs(money) + " рублей\nПожалуйсте выберите другой напиток или пополните баланс.");
            money=userMoney;
            System.out.println("Ваш баланс: " + money);}
        Thread.sleep(100);

    }

}