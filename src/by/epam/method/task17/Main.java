package by.epam.method.task17;

import java.util.Scanner;

/**/

public class Main {
	public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
		System.out.println("Enter k");
		int k = scanner.nextInt();
		int rez = srch(k);
        System.out.println(rez);
    }

    private static int  srch (int k) {
        int sum = 0;
        int buf;
        int n = 0;
        int count = 0;

        do {
            buf = k;
            do {
                buf /= 10;
                n++;
            } while (buf > 0);

            buf = k;
            for (int j = 0; j < n ; j++) {
                sum += (buf % 10);
                buf /= 10;
            }
            k -= sum;
            count++;
        } while (k > 0);

        return count++;
    }
}
