package lesson02;

// Разбор ДЗ с преподом

import java.util.Arrays;

public class DoApp {

    public static void main(String[] args) {

        // В метод main записываются все исходные данные и выводы данных, а все методы вычислительные за ним


        //Task 1. Задать целочисленный=int массив, состоящий из элементов 0 и 1.[ 1, 1, 0, 0, 1, 0, 1, 1, 0, 1].


        System.out.println("Task 1:");    // вывод задания Task 1
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 1}; // инициализация массива
        System.out.println(Arrays.toString(array)); // вывод массива через метод toString
        changeArray(array);         // метод changeArray
        System.out.println(Arrays.toString(array)); // вывод массива после изменений через метод changeArray

         /*2.	Задать пустой целочисленный массив размером 8.
    С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;*/


        System.out.println("Task 2:");
        int[] emptyArray = new int[8];

        System.out.println(Arrays.toString(emptyArray));
        fillArrayWithProgression(emptyArray);           // метод fillArrayWithProgression
        System.out.println(Arrays.toString(emptyArray));

        /* 3.	Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
 и числа меньшие 6 умножить на 2;*/
        System.out.println("Task 3:");
        int[] myArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        System.out.println(Arrays.toString(myArray));
        multiplyIn(myArray);
        System.out.println(Arrays.toString(myArray));

        /* 4.	Создать квадратный двумерный целочисленный массив
(количество строк и столбцов одинаковое),
и с помощью цикла(-ов) заполнить его диагональные элементы единицами */

        System.out.println("Task 4:");
        int[][] noArray = new int[6][6];

        printSquare(noArray);
        fillDiagonalsWithOnes(noArray);
        System.out.println();
        printSquare(noArray);

        /* 5.  Задать одномерный массив и найти в нем минимальный и
 максимальный элементы (без помощи интернета);*/

        System.out.println("Task 5:");
        int[] minMaxArray = {13, 17, 6, 0, 1, 10, 9, 5, 8, 9};


        System.out.println(Arrays.toString(minMaxArray));
        int max = findMax(minMaxArray); //
        int min = findMin(minMaxArray);   // метод для вычисления min

        System.out.println("Max:" + max);  //
        System.out.println("Min:" + min); // вывод в косоль мин

        printMinAndMax(minMaxArray);  // метод для принта

        /* Написать метод, в который передается не пустой одномерный
целочисленный массив, метод должен вернуть true,
если в массиве есть место, в котором сумма левой и
 правой части массива равны. Примеры:
 checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true,
checkBalance([1, 1, 1, || 2, 1]) → true, */

        System.out.println("Task 6:");
        int[] balanceArray = {2, 2, 2, 1, 2, 2, 10, 1};

        System.out.println(Arrays.toString(balanceArray));
        boolean isBalanced = hasBalance(balanceArray);
        System.out.println("Is balanced? :" + isBalanced);
    }


    // Task 1 вычисление
    static void changeArray(int[] array) {             // методу changeArray передаются данные массива int[] array
        for (int i = 0; i < array.length; i++) {

            /*array[i] = (array[i] == 1) ? 0 : 1;  */          //тернарный оператор(если i=1, то 0, если нет, то 1
            array[i] = 1 - array[i];                       // можно так
        }

    }

    // Task 2 вычисление
    static void fillArrayWithProgression(int[] emptyArray) {
        for (int i = 0; i < emptyArray.length; i++) {         // условия фор (в массиве только 0)
            emptyArray[i] = 3 * i;             // оператор логики
        }

    }

    // Task 3 вычисление
    static void multiplyIn(int[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            /* array[i] = (array[i] < 6) ? (array[i] * 2) : array[i];  // тернарный оператор, если <6, то *2 или как есть*/
            if (myArray[i] < 6)                                       // или можно через if
            {
                myArray[i] = myArray[i] * 2;
            }
        }
    }

    // Task 4 вычисление
    // При вычислении [][] нужно 2 метода
    static void printSquare(int[][] noArray) {   // 1 метод
        for (int i = 0; i < noArray.length; i++) {

            System.out.println(Arrays.toString(noArray[i]));

        }

    }

    static void fillDiagonalsWithOnes(int[][] square) {   // 2 метод
        for (int i = 0; i < square.length; i++) {

            square[i][i] = 1;    // логика - вывод 1 на главной диагонали
            square[i][square[i].length - i - 1] = 1;  // вывод 1 на другой диагонали
        }
    }

    //  Task 5 вычисление
    // Используем 2 метода-логика (на max и min) и метод принта

    static int findMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {

                max = array[i];
            }
        }
        return max;

    }

    static int findMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {

                min = array[i];
            }
        }
        return min;


    }

    static void printMinAndMax(int[] array) {

        int min = array[0];
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {

                min = array[i];
            }
            if (max > array[i]) {

                min = array[i];
            }
        }

    }

    // Task 6 вычисление

    static boolean hasBalance(int[] array)
    {
        int leftSum = 0;        // левая граница массива

        for (int i = 0; i < array.length; i++) {  // этот цикл считает левую  часть
            leftSum += array[i];  // суммируем слева

            int rightSum = 0; // правая граница массива

            for (int j = (i + 1); j < array.length; j++) { // этот цикл считает правую часть

                rightSum += array[j];  // суммируем справа
            }
            if (leftSum == rightSum)   // если левая сумма будет равна правой
            {
                return true;    // то вернуть true - завершить работу
            }
        }

            return false;        // если нет, то ложь - продолжать суммировать

        }
    }
