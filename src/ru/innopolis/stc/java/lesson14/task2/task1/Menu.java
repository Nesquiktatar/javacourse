package ru.innopolis.stc.java.lesson14.task2.task1;

public enum Menu {
    SPRITE("SPRITE",50),
    FANTA("FANTA",60),
    MIRINDA("MIRINDA",70),
    WATER("WATER",40),
    JUICE("JUICE",100);

    private int price;
    private String name;

    
     Menu(String name, int price) {
        this.name=name;
        this.price = price;
    }

    public String toString() {
        return "Название напитка ='" + name + '\'' +
                ", стоимость = " + price + " рублей\n";
    }

    public String getName(){return name;}

    public int getPrice() { return price; }
}
