package ru.innopolis.stc.java.lesson8.task3;

public class  Box {
    private static int boxNumber = 0;
    private char size;
    private String color;
    private int cost;

    Box(char size, String color, int cost) {
        this.size=size;
        this.color=color;
        this.cost=cost;
        boxNumber++;
    }

    public static int getBoxNumber() {
        return boxNumber;
    }


//2) Вынести метод printOutCount из класса Box. Оставить в Box геттер счетчика
//3) Много дублирования кода в Gifts. Попробуй вынести общий код из оператора switch

}
