package ru.innopolis.stc.java.lesson7.task1;

public enum Drinks {
    SPRITE(50),
    FANTA(60),
    MIRINDA(70),
    WATER(40),
    JUICE(100);

    private int price;

    Drinks(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
