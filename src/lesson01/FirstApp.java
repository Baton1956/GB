package lesson01;


public class FirstApp {
    public static void main(String args[]) {
        /**Задать целочисленный=int массив, состоящий из элементов 0 и 1.
         Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
         С помощью цикла for и условия заменить 0 на 1, 1 на 0; */



        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 1};
        int arrll = arr.length;
        for (int i = 0; i < arrll; i++) {
            if (arr[i] == 1) arr[i] = 0;
            else arr[i] = 1;
        }
        System.out.println("Task 1:");
        for (int i = 0; i < arrll; i++) {
            System.out.println(i + "-" + arr[i]);
        }

        /*объявляем и инициализируем три переменные
        int a = 2, b = 3, c = 0;

        if (a < b) {      // если a меньше b
            System.out.println("a меньше b");
        }
        if (a == b) {    // если a равно b
            System.out.println("a равно b. Это сообщение не будет выведено"); */

        /*    int[] arr = {2, 4, 5, 1, 2, 3, 4, 5, 8, 6, 7};
    System.out.println("arr.length: " + arr.length);
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    }
        int counter = 1;
        int[][] table = new int[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                table[i][j] = counter;
                System.out.print(table[i][j] + " ");
                counter++;
            }
            System.out.println(); */

/*
    int[][] arr2 = new int[3][5];
        for(
    int i = 0;
    i< 3;i++)

    {
        for (int j = 0; j < 5; j++) {

            System.out.print(arr2[i][j] + " ");

        }
        System.out.println();
    } */
       /* int[] numbers = {-9, 6, 0, -59};
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (min> numbers[i])
                min = numbers[i];
        }

            System.out.println(min); */
        /** Найти max, min в массиве */

       /* int numbers[] = { 92, -108, 2, 120, 67, 4, -81, 9, 88, 1 }; // выводит max, min
        int min, max;
        min = max = numbers[0];

        for (int i = 1; i < 10; i++) {
            if (numbers[i] < min)
                min = numbers[i];
            if(numbers[i] > max){
                max = numbers[i];
            }
        }
        System.out.println("min is: " + min + "; max is: " + max); */

        /**создать квадратный двумерный массив и заполнить его диагональные элементы единицами при помощи цикла */

        /*int[][] arr = new int[4][4]; // создать квадратный двумерный массив и заполнить его диагональные элементы единицами при помощи цикла
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0, x = arr[i].length; j < arr[i].length; j++, x--) {
                if (i == j || i == x - 1) arr[i][j] = 1;
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        } */

    }
}












