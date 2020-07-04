package ru.innopolis.stc.java.lesson22.task1;

import java.util.*;

class Main {
    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();

        personList.add(new Person("Андрей", 20));
        personList.add(new Person("Булат", 20));
        personList.add(new Person("Вася", 2));
        personList.add(new Person("Анна", 2));
        personList.add(new Person("Андрей", 25));

        personList.sort(new PersonComparator());
        System.out.println(personList);

    }


}
