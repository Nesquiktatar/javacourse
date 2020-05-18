package ru.innopolis.stc.java.lesson15.task1;

import static java.nio.file.StandardCopyOption.*;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

//Написать программу, которая будет создавать, переименовывать, копировать и удалять файл.
public class Files {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the name of txt file:");
        String fileName = in.next();

        File directory = new File("D:\\New Folder");
        File file = new File(directory, fileName + ".txt");



        if (directory.mkdir()) {
            System.out.println("Created the catalog: " + directory.getName());
        }
        while (true) {

            System.out.println("\nWhat you want to do? (q for exit)\ncreate\nrename\ndelete");
            String user = in.next();

            if(user.equals("q"))
                break;
           try{ switch (user) {
               case "create": {
                   file.createNewFile();
                   System.out.println("Created the file: " + file.getName());
               }
               break;
               case "rename": {
                   System.out.println("Enter the new name of file: ");
                   String name2 = in.next();
                   File file2 = new File(directory, name2 + ".txt");
                   file.renameTo(file2);
                   System.out.println("Renamed the file to " + name2);
               }
               break;
               case "delete": {
                   file.delete();
                   System.out.println("File was deleted.");
               }
               break;
               default:
                   System.out.println("Please choose something.");
           }
            }catch (Exception e){
               System.out.println("Exception" + e);
           }
        }
    }
}



