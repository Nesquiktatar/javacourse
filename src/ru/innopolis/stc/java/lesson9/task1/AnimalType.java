package ru.innopolis.stc.java.lesson9.task1;

public enum AnimalType {
    CAT ("КОШКА"),
    DOG ("СОБАКА"),
    DUCK("УТКА");

    private String type;

    AnimalType(String type){
        this.type=type;
    }

    public String getType (){return type; }
}
