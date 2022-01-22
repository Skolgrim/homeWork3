import java.util.Arrays;

public class FirstClass {
    public static void main(String[] args) {
        replacement();
        emptyArray();
        multiplicationInArray();
        square();
        simpleArray(5, 3);
        search();
    }

    public static void replacement() {
/* 1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
С помощью цикла и условия заменить 0 на 1, 1 на 0 */
        int array[] = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.print(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else if (array[i] == 1) {
                array[i] = 0;
            }
        }
        System.out.println();
        System.out.print(Arrays.toString(array));
        System.out.println();
        System.out.println();
    }

    public static void emptyArray() {
/* 2. Задать пустой целочисленный массив длиной 100
 С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100 */
        int array[] = new int[100];
        System.out.print(Arrays.toString(array));
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        System.out.print(Arrays.toString(array));
        System.out.println();
        System.out.println();
    }

    public static void multiplicationInArray() {
 /* 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
 и числа меньшие 6 умножить на 2 в массиве; */
        int arr[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.print(Arrays.toString(arr));
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] *= 2;
            }
        }
        System.out.print(Arrays.toString(arr));
        System.out.println();
        System.out.println();
    }

    public static void square() {
/* 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
и с помощью цикла(-ов) заполнить его диагональные элементы единицами
(можно только одну из диагоналей, если обе сложно).
Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны,
то есть [0][0], [1][1], [2][2], …, [n][n]; */
        int square[][] = new int[5][5];
        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square[i].length; j++) {
                if (i == j) {
                    square[i][j] = 1;
                } else if (i == 0 && j == 4 || i == 1 && j == 3 || i == 3 && j == 1 || i == 4 && j == 0) {
                    square[i][j] = 1;
                }
                System.out.print(square[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void simpleArray(int len, int initialValue) {
/* 5. Написать метод, принимающий на вход два аргумента: len и initialValue,
и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue; */
        int arr[] = new int [len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        System.out.print(Arrays.toString(arr));
        System.out.println();
        System.out.println();
    }
    public static void search () {
/* 6. * Задать одномерный массив и найти в нем минимальный и максимальный значения элементов */
        int arr [] = {1, 6, 2, 4, 8, 13 ,22, 0, 3, 69, 85, 2};
        System.out.print(Arrays.toString(arr));
        System.out.println();
        int max = 0;
        int min = arr[1];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= max) {
                max = arr[i];
            } else if (arr[i] <= max) {
                arr[i] = min;
            }
        }
        System.out.println("Максимальное число в массиве: " + max);
        System.out.println("Минимальное число в массиве: " + min);
    }
}
