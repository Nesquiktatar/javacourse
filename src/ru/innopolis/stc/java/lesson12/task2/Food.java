package ru.innopolis.stc.java.lesson12.task2;
//ArrayIndexOutOfBoundsException
public class Food {

    public static void putFood(String[] food) {
       try{
           food[6] = "Ice cream";
           System.out.println(food[6]);
       }
       catch (ArrayIndexOutOfBoundsException exception){
           System.out.println("Exceptional situation: " + exception.getMessage());
       }
        System.out.println("Normal continuation");
    }

    public static void main(String[] args) {
         String[] refrigerator = {"Eggs", "Apple", "Drink", "Vegetables"};
         putFood(refrigerator);
    }
}
