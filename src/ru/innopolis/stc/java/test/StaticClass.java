package ru.innopolis.stc.java.test;
//Урок № 10, пример по статическим

class OuterClass2{
public static String s="My string";
    static class InnerStaticClass{
        public static int i=1;
        public static void greet(){
            System.out.println("Hello!");

        }
    }

    interface InnerInterface {
        double g = 9.8;
        void my_method();
    }
}

class MyNewClass implements OuterClass2.InnerInterface{
    @Override
    public void my_method() {
        System.out.println("My method is accomplished!");
    }
}
public class StaticClass{
    public static void main(String[] args) {
        System.out.println(OuterClass2.InnerStaticClass.i);
        OuterClass2.InnerStaticClass.greet();

        MyNewClass mnc = new MyNewClass();
        mnc.my_method();
    }
}