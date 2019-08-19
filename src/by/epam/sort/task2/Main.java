package by.epam.sort.task2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*Даны две последовательности a 1  a 2    a n и b 1  b 2    b m . Образовать из них новую последовательность
чисел так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать.*/

public class Main {
    public static void main(String[] args) {
    	 Scanner in = new Scanner(System.in);
         System.out.println("Enter the size of the first array:");
         int sizeA = in.nextInt();

         System.out.println("Enter the size of the second array:");
         int sizeB = in.nextInt();

         int[] arrayA = new int[sizeA];
         int[] arrayВ = new int[sizeB];

         Random random = new Random();
         for (int i = 0; i < arrayA.length; i++) {
             arrayA[i] = random.nextInt(2) +i*2;
         }
         
         for(int i = 0; i < arrayA.length; i++) {
        	    System.out.print(" " + arrayA[i] + " "); 
         }
         
         System.out.println();
         for (int i = 0; i < arrayВ.length; i++) {
             arrayВ[i] = random.nextInt(2) +i*3;
         }
         
         for(int i = 0; i < arrayA.length; i++) {
        	 System.out.print(" " + arrayВ[i] + " "); 
         }
         
         System.out.println();
         int[] finalArray = new int[arrayA.length+arrayВ.length];
         System.arraycopy(arrayA, 0, finalArray, 0, arrayA.length);
         System.arraycopy(arrayВ, 0, finalArray, arrayA.length, arrayВ.length);
         Arrays.sort(finalArray);

         System.out.println("Result: " + Arrays.toString(finalArray));
    }
}
