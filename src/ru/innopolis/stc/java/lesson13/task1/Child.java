package ru.innopolis.stc.java.lesson13.task1;

 class Child {

     public static void eat(String food) throws Exception {
        if (food.toUpperCase().equals(Food.APPLE.getName()) || food.toUpperCase().equals(Food.CARROT.getName())
        || food.toUpperCase().equals(Food.MILK.getName()) || food.toUpperCase().equals(Food.PORRIDGE.getName()))
        System.out.printf("Съел %s за обе щеки.\n", food);
        else throw new Exception("Я такое не ем!");
    }
}

