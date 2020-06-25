package lesson01;

public class JavaApp {
    public static void main(String[] args) {
        byte num = 2;
        int i = 23456;
        long num_1 = 345786;
        float num_2 = 324.456f;
        double num_3 = 4536.43f;

        char sym = 'A';  //  переменная    обозначающая  символы

        boolean is_happy = false;    //  эта  переменная  выводит  истину  (true)  или  ложь(false)

        String str = "Hello  World";  //  эта  переменная  выводит  строку

        System.out.println("  " + str);
        System.out.println("  " + sym);
        System.out.println("  =" + i);    //можно  так  писать

        System.out.println("Variab  e  =" + num_1);  //можно  так  писать

        System.out.println("Variab  e  =" + num_2);
        System.out.println("Variab  e  =" + is_happy); //
    }
}