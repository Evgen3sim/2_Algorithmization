package by.epam.method.task14;

import java.util.Scanner;

/*Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр, возведенная в степень n,
  равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи использовать декомпозицию.*/

public class Main {
	
	  public static void main(String args[]) {


	        Scanner scanner = new Scanner(System.in);


	        System.out.println("Enter the number K:");
	        long sizeК = scanner.nextLong();
	        armstrong(sizeК);
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

    static void armstrong(long chit) {


        for (long i = 1; i <= chit; i++) {

            long sumArm = 0;
            int[] array = arrayOfPrimeNumbers(i).clone();
            for (int j = 0; j < array.length; j++) {

                sumArm += Math.pow(array[j], array.length);

            }
            if (i == sumArm) {
                System.out.println("" + sumArm + "    is Armstrong's number  " + i);

            }

        }
    }
}
