package by.epam.onedimensionalarrays.task3;

/*
*
* Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
положительных и нулевых элементов.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Input the size of array");
        int size = scn.nextInt();

        int [] array = new int[size];

        int otr = 0;
        int pol = 0;
        int nul = 0;

        for (int i = 0; i < array.length; i++){
            array[i] = (int)((Math.random() * 30) - 15);
            System.out.println(" " + array[i]);
        }

        for (int i = 0; i < array.length; i++){
            if (array[i] == 0){
                nul++;
            } else if (array[i] < 0)
            {
                otr++;
            } else if (array[i] > 0){
                pol++;
            }
        }

        System.out.println("Count of positive numbers " + pol);
        System.out.println("Count of negative numbers " + otr);
        System.out.println("Count of zero numbers " + nul);
    }
}
