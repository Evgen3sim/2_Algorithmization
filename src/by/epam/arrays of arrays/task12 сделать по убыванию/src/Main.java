
/*Отсортировать строки матрицы по возрастанию и убыванию значений элементов.*/

import  java.util.*;

public class Main {
    public static void main(String[] args) {

        int [][] array = new int[7][7];
        Integer[][] objectArray = new Integer[array.length][];


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

        for (int i = 0; i < array.length; i++){
            Arrays.sort(array[i]);
        }
        System.out.println();
        System.out.println("По возрастанию");
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){

                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }


        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                objectArray[i][j] = Integer.valueOf(array[i][j]);
            }

            Arrays.sort(array, Collections.reverseOrder());
            System.out.println();
        }

        System.out.println();
        System.out.println("По убыванию");
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){

                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }








    }
}
