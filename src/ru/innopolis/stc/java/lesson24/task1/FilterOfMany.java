package ru.innopolis.stc.java.lesson24.task1;

import java.util.*;

public class FilterOfMany {

    public static Set<String> removeEvenLength(Set<String> set) {
        Set<String> setData = new LinkedHashSet<>();
        String[] strings = set.toArray(new String[0]);

        for (String string : strings) {
            if (string.length() % 2 == 1) {
                setData.add(string);
            }
        }
        System.out.println(setData);
        return setData;
    }

    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>(Arrays.asList("foo", "buzz", "bar", "fork", "bord", "spoon", "!", "dude"));
        removeEvenLength(set);
    }
}
