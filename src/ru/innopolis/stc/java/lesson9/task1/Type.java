package ru.innopolis.stc.java.lesson9.task1;

public enum Type {
    CAT ("КОШКА"),
    DOG ("СОБАКА"),
    DUCK("УТКА");

    private String type;

    Type (String type){
        this.type=type;
    }

    public String getType (){return type; }
}
