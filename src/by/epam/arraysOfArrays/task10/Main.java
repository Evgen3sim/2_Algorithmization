package by.epam.arraysOfArrays.task10;

/*Найти положительные элементы главной диагонали квадратной матрицы.*/

public class Main {
    public static void main(String[] args) {

        int[][] array = new int[5][5];

        for (int i = 0; i < array.length; i ++){
            for (int j = 0; j < array.length; j ++){

                array[i][j] = (int)(Math.random() * 10) - 5;

            }

        }

        for (int i = 0; i < array.length; i ++){
            for (int j = 0; j < array.length; j ++){

                System.out.print(array[i][j] + " ");

            }
            System.out.println();

        }

        System.out.println("Positive  ");
        for (int i = 0; i < array.length; i ++){
            for (int j = 0; j < array.length; j ++){

               if ((i == j) && array[i][j] > 0){
                   System.out.println(" " + array[i][j]);
               }

            }

        }



    }
}
