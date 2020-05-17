package ru.innopolis.stc.java.lesson13.task1;

public enum Food {
    APPLE("ЯБЛОКО"),
    CARROT("МОРКОВЬ"),
    MILK("МОЛОКО"),
    PORRIDGE("КАША");

    private String name;

    Food(String name) {
        this.name = name;
    }

    public String getName(){return name;}

    public String toString (){
       return "Название блюда: " +  name +"\n";
    }
}
