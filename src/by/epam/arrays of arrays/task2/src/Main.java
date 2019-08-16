

/*Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.*/

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("enter size");
        int size = scn.nextInt();
        int size2 = scn.nextInt();

        int [][] matrix = new int[size][size2];

        System.out.println("Matrix");
        for(int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix.length; j++){
                matrix[i][j] = (int)(Math.random()*100) - 50;
            }
        }

        for(int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix.length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println("///////////");
        for(int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix.length; j++){

                if (i == j){
                    System.out.println(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
