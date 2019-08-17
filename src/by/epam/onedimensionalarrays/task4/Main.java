package by.epam.onedimensionalarrays.task4;

/*Даны действительные числа а 1 ,а 2 ,..., а n . Поменять местами наибольший и наименьший элементы.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the size of array = ");
        int size = scanner.nextInt();
      
        int [] array = new int [size];
        System.out.println("Input the elements of array: ");
        
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
       
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        System.out.println("Before");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == max) {
                array[i] = min;
            } else if (array[i] == min) {
                array[i] = max;
            }
        }
        System.out.println("After");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}
