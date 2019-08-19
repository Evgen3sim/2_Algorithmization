package by.epam.arraysOfArrays.task1;

import java.util.Scanner;

/*. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.*/


public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter size matrix");
        int size = scn.nextInt();
        int size2 = scn.nextInt();

        int[][] array = new int[size][size2];

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                array[i][j] = scn.nextInt();
            }
        }

        System.out.println("Your matrix");
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("result");
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                if (((j + 1) % 2 != 0) && (array[0][j] > array[array.length - 1][j])){
                    System.out.println(array[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
