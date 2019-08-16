
/*Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.*/

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [][] array = new int[7][7];



        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){

                array[i][j] = (int)(Math.random() * 15 ) - 5;

            }
        }

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){

                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        for (int j = 0; j < array.length; j++){
            Arrays.sort(array[j]);
        }
        System.out.println();
        System.out.println("По возрастанию");
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){

                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
