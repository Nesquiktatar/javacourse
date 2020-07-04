package ru.innopolis.stc.java.lesson22.task1;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        int nameCompareResult = o1.getName().compareTo(o2.getName());

        if (nameCompareResult != 0) {
            return nameCompareResult;
        }
        if (o1.getAge() < o1.getAge()) {
            return -1;
        }
        if (o1.getAge() > o1.getAge()) {
            return 1;
        } else {
            return 0;
        }
    }


}
