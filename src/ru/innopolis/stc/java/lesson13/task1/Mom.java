package ru.innopolis.stc.java.lesson13.task1;

import java.util.Scanner;

public class Mom {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.println("Чем накормим ребенка?");
        while(in.hasNext()) {
            String feedFood = in.nextLine();
            if("exit".equals(feedFood)){
                System.out.println("STOP Feeding");
                break;}
            try{
                Child.eat(feedFood);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }


        }


    }
}