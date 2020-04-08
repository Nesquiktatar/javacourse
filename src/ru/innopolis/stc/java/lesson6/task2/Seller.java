package ru.innopolis.stc.java.lesson6.task2;

public class Seller {

    private CashDesk cashDesks[];

    public void takeMoney () {
        System.out.println("Taking the money");
    }
    public Seller (){
    }
}

public class CashDesk{
    private Seller sellers[];

    public void receipt (){
        System.out.println("Printing the receipt");
    }

    public CashDesk(){
    }
}