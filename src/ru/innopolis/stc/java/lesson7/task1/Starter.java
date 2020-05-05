package ru.innopolis.stc.java.lesson7.task1;

import java.security.PublicKey;
import java.util.Arrays;
import java.util.Scanner;

public class Starter {
    public static int money = 0;


    public static void main(String[] args) throws InterruptedException {

        System.out.println("Меню : ");
        System.out.println(Arrays.toString(Drinks.values()));

        System.out.println();
        System.out.print(Drinks.SPRITE + " " );
        System.out.println(Drinks.SPRITE.getPrice() + " рублей");
        System.out.print(Drinks.FANTA + " " );
        System.out.println(Drinks.FANTA.getPrice() + " рублей");
        System.out.print(Drinks.MIRINDA + " " );
        System.out.println(Drinks.MIRINDA.getPrice() + " рублей");
        System.out.print(Drinks.WATER + " " );
        System.out.println(Drinks.WATER.getPrice() + " рублей");
        System.out.print(Drinks.JUICE + " " );
        System.out.println(Drinks.JUICE.getPrice() + " рублей");
        System.out.println();

        Scanner inputScanner =  new Scanner ( System.in) ;
        String usernameDrink;
        System.out.println("Выберите один из напитков");
        usernameDrink = inputScanner.nextLine();

        Starter starter = new Starter();

        switch ( usernameDrink) {
            case ("SPRITE") : starter.inc(50); break;
            case ("FANTA") : starter.inc(60); break;
            case ("MIRINDA") : starter.inc(70); break;
            case ("WATER") : starter.inc(40); break;
            case ("JUICE") : starter.inc(100); break;
            default :
                System.out.println("Пожалуйста выберите напиток из меню.");

        }

        System.out.println();
    }

    public void inc(int count) throws InterruptedException {
        money -= count;

        int userMoney;
        Scanner inputScanner =  new Scanner ( System.in) ;

        System.out.println("Сколько денег вы хотите положить на баланс?");
        userMoney = inputScanner.nextInt();
        money+=userMoney;

        if (money>=0)
            System.out.println("У вас осталось : " + money +  " рублей. \nВозмьите ваш напиток" ); // как добавить имя напитка?
        else
            System.out.println("У вас не хватает:" + Math.abs(money) +  " рублей\nПожалуйсте выберите другой напиток или пополните баланс.");
        Thread.sleep(100);

    }

    }