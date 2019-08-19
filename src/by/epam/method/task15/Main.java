package by.epam.method.task15;

import java.util.Scanner;

/*Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую последовательность (например, 1234, 5789).
 Для решения задачи использовать декомпозицию.*/

public class Main {
	public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter the number N");
        int sizeК = scanner.nextInt();

        sequence(sizeК);
    }
	static int[] arrayOfPrimeNumbers(long chi) {

        int length = 0;
        long inChi = chi;
        while (inChi > 0) {
            inChi = inChi / 10;
            length++;


        }
        int i = length;
        int[] finlArr = new int[length];
        while (chi > 0) {


            finlArr[i - 1] = (int) chi % 10;

            chi = chi / 10;
            i--;
        }
        return finlArr;

    }


    static void sequence(int syper) {

        for (long i = (long) Math.pow(10, syper - 1); i < (long) Math.pow(10, syper); i++) {
            int fin =0;
            int[] array = arrayOfPrimeNumbers(i).clone();
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] == (array[j + 1]-1)) {
                 fin++;
                } else {
                    fin--;
                }
            }
            if (fin==syper-1) {
                System.out.println("Number   :" + i);
            }
        }
    }
}
