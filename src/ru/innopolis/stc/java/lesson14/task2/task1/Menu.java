package ru.innopolis.stc.java.lesson14.task2.task1;

public enum Menu {
    SPRITE(50),
    FANTA(60),
    MIRINDA(70),
    WATER(40),
    JUICE(100);

    private int price;
    
    Menu(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
