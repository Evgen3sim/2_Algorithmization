package by.epam.method.task8;

/*Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов
массива с номерами от k до m.*/

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array");
		int number = scanner.nextInt();
		int [] array = new int[number];

		System.out.println("Enter elements");
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}

		System.out.println("array = ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

		System.out.println("\nD[1] + D[2] + D[3] = " + getSum(1, 3, array) + "\nD[3] + D[4] + D[5] = "
				+ getSum(3, 5, array) + "\nD[4] + D[5] + D[6] = " + getSum(4, 6, array));
	}

	private static int getSum(int k, int m, int[] array) {
		int sum = 0;
		for (int i = k - 1; i < m; i++) {
			sum += array[i];
		}
		return sum;
	}

}
