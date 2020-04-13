package ru.innopolis.stc.java.lesson6.task4;
// Агрегация
import java.nio.file.attribute.GroupPrincipal;
import java.util.Scanner;

public class University {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);


        System.out.println("Введите название группы:");
        String nameOfGroup = inputScanner.nextLine();

        System.out.println("Введите количество учеников:");

        int numberofStudents = inputScanner.nextInt();

        Group A9 = new Group(numberofStudents);
        A9.SetName(nameOfGroup);

        System.out.println("Добавим нового ученика. \nВведите имя: ");
        String name=inputScanner.next();

        System.out.println("Введите возраст: ");
        int age=inputScanner.nextInt();

        System.out.println("Введите пол: ");
        String sexString = inputScanner.next();
        char sex=sexString.charAt(sexString.length()-1);
        Student student = new Student(name,age,sex);

        A9.SetStudent(6,student);

        System.out.println("Сколько денег " + name + " хочет положить на счет?\nВведите в рублях: ");
        int payRub=inputScanner.nextInt();
        student.payMoney(payRub);



    }
}
