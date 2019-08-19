package by.epam.arraysOfArrays.task8;

import java.util.Scanner;

/*В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
пользователь с клавиатуры.*/

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int[][] array = {{5, 4, 3, 7, 9},{1, 7, 8, 9, 4},{4, 6, 8, 9, 10},{23, 4, 7, 8, 4}};

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Enter");

        int a = scn.nextInt();
        int b = scn.nextInt();
        int buff;

        for (int i = 0; i < array.length; i++){
                buff = array[i][a];
                array[i][a] = array[i][b];
                array[i][b] = buff;
        }

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }




    }
}
