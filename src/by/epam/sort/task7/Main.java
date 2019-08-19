package by.epam.sort.task7;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*Пусть даны две неубывающие последовательности действительных чисел a 1  a 2    a n и b 1  b 2    b m .
Требуется указать те места, на которые нужно вставлять элементы последовательности b 1  b 2    b m в первую
последовательность так, чтобы новая последовательность оставалась возрастающей.*/

public class Main {
    public static void main(String[] args) {

    	int [] secondArray = new int [10];
        int [] firstArray = new int [25];

        for (int j = 0; j < 15; j++) {
            firstArray[j] = (int) (Math.random() * 10 + 1);
        }
        
        for (int j = 0; j < 15; j++) {
           System.out.print(firstArray[j] + " ");
        }
        
        System.out.println();
        
        for (int j = 0; j < 10; j++) {
            secondArray[j] = (int) (Math.random() * 10 + 1);
        }
        
        for (int j = 0; j < 10; j++) {
            System.out.print(secondArray[j] + " ");
         }

        System.out.println();
        int count = 0;
        for (int i = 15; i < 15 + 10; i++) {
            firstArray[i] = secondArray[count];
            count++;
        }

        int buf;
        for (int i = 0; i < 15 + 10; i++) {
            for (int j = 1; j < 15 + 10; j++) {
                if (firstArray[j] < firstArray [j-1]) {
                    buf = firstArray[j];
                    firstArray[j] = firstArray [j-1];
                    firstArray[j-1] = buf;
                }
            }
        }

        for (int i = 0; i < 15 + 10; i++) {
            System.out.print(firstArray[i] + " ");
        }


    }
}
