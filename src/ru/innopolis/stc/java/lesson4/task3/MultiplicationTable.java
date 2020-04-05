package ru.innopolis.stc.java.lesson4.task3;

public class MultiplicationTable {
    public static void main(String[] args) {

        int i, j;
        for (i=0; i<10; i++){
            for (j=0; j<10; j++){
                System.out.printf("%5d",(i+1)*(j+1));
            }
            System.out.println();
        }

    }
}
