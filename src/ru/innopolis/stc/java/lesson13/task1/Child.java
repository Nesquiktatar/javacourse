package ru.innopolis.stc.java.lesson13.task1;

 class Child {

    public static void eat(String food) throws Exception {

        if(food.equals("Морковь") || food.equals("Яблоко") || food.equals("Каша")|| food.equals("Молоко") )
        System.out.printf("Съел %s за обе щеки.\nСпасибо, мама!\n", food);
        else throw new Exception("Cпасибо, мама!");

    }
}

