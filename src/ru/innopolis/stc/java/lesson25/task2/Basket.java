package ru.innopolis.stc.java.lesson25.task2;

public interface Basket {

    void addProduct(String name, Integer quantity);


    void removeProduct(String product);


    void updateProductQuantity(String name, Integer quantity);


    void clear();


    void printBasket();

    int getProductQuantity(String product);
}
