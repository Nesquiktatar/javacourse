package ru.innopolis.stc.java.lesson15.task2;

import java.io.File;
import java.util.Scanner;

public class Recursion {

    public static void showFilesAndDirectories(File f) {
        int i=0;

        for(File p:f.listFiles()){
            i++;
            if (!p.isDirectory ()) {
                String space = " ";
                System.out.println (space.repeat(i)+ p.getName () + " is not directory");
            }
            if (p.isDirectory ()) {
                try {

                    String space = " ";
                    System.out.println(space.repeat(i)+p.getName() + " is directory");
                    showFilesAndDirectories(p);
                }
                catch(Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
            System.out.println("Enter full path ('quit' to exit):");
            String userPath = in.next();

        File user = new File(userPath);
        showFilesAndDirectories(user);
    }
}
