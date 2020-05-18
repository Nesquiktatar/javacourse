package ru.innopolis.stc.java.lesson15.task2;

import java.io.File;
import java.util.Scanner;

public class Recursion {

    public static void showFilesAndDirectories(File f, int recursionDepth) {

        for(File p:f.listFiles()){

            if (!p.isDirectory ()) {
                String space = "    ";
                System.out.println (space.repeat(recursionDepth)+ p.getName ());
            }
            if (p.isDirectory ()) {
                try {
                    String space = "    ";
                    System.out.println(space.repeat(recursionDepth)+p.getName());
                    showFilesAndDirectories(p,recursionDepth+1);
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
        showFilesAndDirectories(user,0);
    }
}

