package by.epam.arraysOfArrays.task9;

import java.util.Arrays;

/*Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
столбец содержит максимальную сумму.*/

public class Main {
    public static void main(String[] args) {

        int[][] array = new int[5][5];
        int temp[] = new int[array[0].length];

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                array[i][j] = (int)(Math.random()*10) - 0;
            }
        }

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Summa");

        for (int i = 0; i < array[0].length; i++){
            int sum = 0;
            for (int j = 0; j < array.length; j++){
                sum += array[j][i];

            }
            temp[i] = sum;
            System.out.print(sum + " column " + i );
            System.out.println();


        }
        int max = temp[0];
        for (int ktr = 0; ktr < temp.length; ktr++){
            if (temp[ktr] > max){
                max = temp[ktr];
            }
            temp[ktr] = max;

        }

        System.out.print("max " + max);



    }
}
