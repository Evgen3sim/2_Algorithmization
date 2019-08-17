package by.epam.onedimensionalarrays.task1;

import java.util.Scanner;

/*В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К*/

public class Main {

	public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter K");
        int k = scn.nextInt();
        int sum = 0;
            int [] array = new int[10];

            for (int i = 0; i < 10; i++){
                array[i] = ((int)(Math.random() * 100) - 0);
                System.out.println(array[i]);
                if (array[i] % k == 0){
                    sum = sum + array[i];
                }
            }
        System.out.println("Summa " + sum);
    }
}
