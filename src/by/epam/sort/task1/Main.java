package by.epam.sort.task1;

import java.util.Random;
import java.util.Scanner;

/*. Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
дополнительный массив.*/

public class Main {
    public static void main(String[] args) {

    	 Scanner sc = new Scanner(System.in);

         int[] secondArray = new int[5];
         int[] firstArray = new int[10 + secondArray.length];

         System.out.println("Enter elements first array");
         for (int j = 0; j < 10; j++) {
             firstArray[j] = sc.nextInt();
         }
         
         System.out.println("Enter elements secont array");
         for (int j = 0; j < secondArray.length; j++) {
             secondArray[j] = sc.nextInt();
         }

         for (int j = 0; j < 10; j++) {
             System.out.print(firstArray[j] + " ");

         }
         System.out.println();

         for (int j = 0; j < secondArray.length; j++) {
             System.out.print(secondArray[j] + " ");
         }

         System.out.println();
         System.out.println("Enter num К");
         while (!sc.hasNextInt()) {
             System.out.println("Error, try again: ");
             sc.next();
         }
         int k = sc.nextInt();


         for (int i = k + 1; i < 10; i++) {
             firstArray[i + secondArray.length] = firstArray[i];
         }

         int count = 1;
         for (int i = 0; i < secondArray.length; i++) {
             firstArray[k + count] = secondArray[i];
             count++;
         }

         for (int i = 0; i < 10 + secondArray.length; i++) {
             System.out.print(firstArray[i] + " ");
         }
     }
}
