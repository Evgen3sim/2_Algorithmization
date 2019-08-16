
/*Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.*/

import java.util.Arrays;
import java.util.OptionalInt;

public class Main {
    public static void main(String[] args) {

        int[][] array = new int[5][5];

        for(int i = 0; i < array.length; i++){
          for (int j = 0; j < array.length; j++){

              array[i][j] = (int)(Math.random() * 10);

          }
        }

        for(int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){


                System.out.print(array[i][j] + " ");

            }
            System.out.println();
        }


        int max = array[0][0];
        for(int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){

            max = Math.max(max, array[i][j]);

            }

        }
        System.out.println(max);

        for(int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){

                if (array[i][j] % 2 != 0){
                    array[i][j] = max;
                }
            }
        }

        for(int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){


                System.out.print(array[i][j] + " ");

            }
            System.out.println();
        }


    }
}
