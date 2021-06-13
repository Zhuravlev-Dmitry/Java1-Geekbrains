import java.util.Arrays;


public class HomeWork3ZhuravlevD<inputArray> {

    public static void main(String[] args) {
        // 1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        // С помощью цикла и условия заменить 0 на 1, 1 на 0;
        System.out.println("1.Задание.");
        int[] arr = {1, 0, 1, 0, 0, 0, 1, 1, 1, 0, 0};
        System.out.println("До изменения :    " + Arrays.toString(arr));
        invertArray(arr);
        System.out.println("После изменения : " + Arrays.toString(arr));
        //2.Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8…100;
        System.out.println("2.Задание.");
        int[] arr1 = new int[100];
        fillArray(arr1);
        System.out.println(Arrays.toString(arr1));
        //3.Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
        System.out.println("3.Задание.");
        int[] array2 = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        System.out.println("До изменения :    " + Arrays.toString(array2));
        multiply (array2);
        System.out.println("После изменения : " + Arrays.toString(array2));
        //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        // и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей,
        // если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу:
        // индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
        System.out.println("4.Задание.");
        int[][] arrayDiag = new int[8][8];
        completeDiagonal(arrayDiag);
        printArray2(arrayDiag);
        //5. Написать метод, принимающий на вход два аргумента: len и initialValue,
        // и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
        System.out.println("5.Задание.");
        int[] returnMass = returnMassiv(25, 80);
        System.out.println( Arrays.toString(returnMass));
        //6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
        System.out.println("6.Задание.");
        int [] MinMaxArray = { 3, 9, 45, 23, 6, 11, 0, -5, 364, -30, 4};
        System.out.println( Arrays.toString(MinMaxArray));
        MinMethod(MinMaxArray);
        System.out.println("Minimum number : " + MinMethod(MinMaxArray));


        
    }

    public static void invertArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
    }

    public static void fillArray(int[] arr1) {
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i + 1;
        }
    }
    public static void multiply (int[] array2){
        for (int i =0; i < array2.length; i++){
            if (array2[i] < 6) {
                array2[i] = array2[i] * 2;
            }
        }
    }
    public static void completeDiagonal(int[][] arrayDiag) {
        for (int i = 0; i < arrayDiag.length; i++) {
            arrayDiag[i][i] = 1;
            arrayDiag[i][arrayDiag.length - 1 - i] = 1;
        }
    }

    public static void printArray2( int[][] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 0; j < inputArray[i].length; j++) {
                System.out.print(inputArray[i][j] + "  ");
            }
            System.out.println();
        }
    }
    public static int[] returnMassiv(int len, int initValue) {
        int[] mesh = new int[len];
        for (int i = 0; i < mesh.length; i++) {
            mesh[i] = initValue;
        }
        return mesh;
    }
    public static int MinMethod(int[] MinMaxArray) {
        int minNumber = MinMaxArray[0];
        for (int i = 0; i < MinMaxArray.length; i++) {
            if (MinMaxArray[i] < minNumber) {
                minNumber = MinMaxArray[i];
            }

        }
        return minNumber;
    }

}
