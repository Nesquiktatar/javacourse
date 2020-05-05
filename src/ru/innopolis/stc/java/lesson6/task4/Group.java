package ru.innopolis.stc.java.lesson6.task4;

public class Group {

    private String nameOfGroup;
    private  Student[] inabitants;

    public Group(int numberOfStudents){
        inabitants = new Student[numberOfStudents];
    }

    public void SetStudent (int i,Student newStudent){
        inabitants [i] = newStudent;
    }

    public void SetName(String name){
        this.nameOfGroup=name;
    }



}