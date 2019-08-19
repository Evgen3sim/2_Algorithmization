package by.epam.arraysOfArrays.task12;

import  java.util.*;

/*Отсортировать строки матрицы по возрастанию и убыванию значений элементов.*/

public class Main {
    public static void main(String[] args) {

    	Scanner scanner = new Scanner(System.in);
		System.out.print("Input the size of matrix = ");
		int size = scanner.nextInt();
		int[][] array = new int[size][size];
		System.out.println("input the elements of matrix: ");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				array[i][j] = scanner.nextInt();
			}
		}
		System.out.println("Before:");
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
		int i, j = 0, k;
		System.out.println("After:");
		System.out.println("ascending");
			for (i = 0; i < array.length; i++) {
				for (j = 0; j < array.length; j++) {
					for (k = j + 1; k < array.length; k++) {
						if (array[j][i] > array[k][i]) {
							int tmp = array[j][i];
							array[j][i] = array[k][i];
							array[k][i] = tmp;
						}
					}
				}
			}
			for (int z = 0; z < array.length; z++) {
				for (int l = 0; l < array.length; l++) {
					System.out.print(array[z][l] + "\t");
				}
				System.out.println();
			}
			System.out.println("descending");
			for (i = 0; i < array.length; i++) {
				for (j = 0; j < array.length; j++) {
					for (k = j + 1; k < array.length; k++) {
						if (array[j][i] < array[k][i]) {
							int tmp = array[j][i];
							array[j][i] = array[k][i];
							array[k][i] = tmp;
						}
					}
				}
			}
		for (int z = 0; z < array.length; z++) {
			for (int l = 0; l < array.length; l++) {
				System.out.print(array[z][l] + "\t");
			}
			System.out.println();
		}
	}
}
