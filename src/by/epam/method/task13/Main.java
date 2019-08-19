package by.epam.method.task13;

import java.util.Scanner;

/*Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
 Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2. 
 Для решения задачи использовать декомпозицию.*/

public class Main {
    public static void main(String[] args) {
    	
    	Scanner scanner = new Scanner(System.in);
          System.out.println("Enter the number N:");   
          int n = scanner.nextInt();
          number(n);

    }
    
    static void number(int fl) {
        for (int i = fl; i < fl * 2 - 1; i++) {
            if (pr(i) && pr(i + 2)) {
                int fin = i + 2;
                System.out.println("pair of pair numbers :" + i + "   " + fin);
            }
        }

    }
    
    static boolean pr(int fl) {
        if (Math.abs(fl) < 2) {
            return false;
        }
        if (Math.abs(fl) == 2) {
            return true;
        }

        double runner = Math.sqrt(fl);
        for (int i = 2 * fl; i < runner; i++) {
            if (fl % i == 0) {
                return false;
            }

        }
        return true;

    }
}
