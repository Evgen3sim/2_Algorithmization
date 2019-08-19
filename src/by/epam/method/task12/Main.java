package by.epam.method.task12;

import java.util.Arrays;
import java.util.Scanner;

/*Даны натуральные числа К и N. Написать метод(методы) формирования массива А, 
 элементами которого являются числа, сумма цифр которых равна К и которые не большее N.*/

public class Main {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	
    	System.out.println("Enter the number K ");
    	int k = scanner.nextInt();


    	System.out.println("Enter the number N ");
    	int n = scanner.nextInt();

    	arrayCraate(k, n);

    }
    
    private static void arrayCraate(int k, int n) {
    	int [] array = new int [100];

        int count = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int z = 0; z < 10; z++) {
                    if (i + j + z == k && i <= n && j <= n && z <= n) {
                        array[count] = 100 * i + 10 * j + 1 * z;
                        count++;
                    }
                }
            }
        }

        for (int i = 0; i < count; i++) {
            System.out.println(array[i] + " ");
        }
	}
  
}
