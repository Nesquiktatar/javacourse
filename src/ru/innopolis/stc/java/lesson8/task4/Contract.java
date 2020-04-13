package ru.innopolis.stc.java.lesson8.task4;

public class Contract {

    public static int number;
    String date;

    void contracttoact(int number,String date) {
        this.date=date;
        this.number=number;
    }
}
//4. Реализовать два класса: договор и акт. В каждом сделать поля: номер, дата, список товаров (массив строк).
// Написать класс со статическим методом конвертации договора в акт (на вход передавать договор, на выходе получаем акт).
