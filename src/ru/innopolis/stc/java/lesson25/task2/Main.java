package ru.innopolis.stc.java.lesson25.task2;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        BasketImpl basketImpl = new BasketImpl();
        basketImpl.addProduct("Telephone", 3);
        basketImpl.addProduct("I Pad", 341);
        basketImpl.addProduct("I Phone", 3234);
        System.out.println(basketImpl.getProductQuantity("Telephone"));
        basketImpl.clear();
}
}
