package by.epam.onedimensionalarrays.task5;

import java.util.Scanner;

/*Даны целые числа а 1 ,а 2 ,..., а n . Вывести на печать только те числа, для которых а i > i.*/

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Input the size of array ");

        int size = scn.nextInt();
        int array[] = new int[size];

        for (int i = 0; i < array.length; i++){
            array[i] = (int)((Math.random() * 30) - 15);
        }

        System.out.println("Array ");
        for (int i = 0; i < array.length; i++){
            System.out.print(" " + array[i]);
        }

        System.out.println(" ");
        System.out.println("ai > i");
        for (int i = 0; i < array.length; i++){
            if (array[i] > i){
                System.out.print(" " + array[i]);
            }
        }


    }
}
