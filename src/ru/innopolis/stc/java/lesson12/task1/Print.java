package ru.innopolis.stc.java.lesson12.task1;
// NullPointerException
class Print{
    static void printing (){
        try{
            System.out.println("Hello, world!");
            throw new NullPointerException();
        } catch (NullPointerException e){
            System.out.println("Exception: " + e.getMessage());

        }
    }

    public static void main(String[] args) {
        printing();
    }
}