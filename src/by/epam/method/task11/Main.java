package by.epam.method.task11;

import java.util.Scanner;

/*Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.*/

public class Main {
    public static void main(String[] args) {
        
    	 Scanner in = new Scanner(System.in);
         System.out.println("Insert the number A:");
         int a = in.nextInt();
         
         System.out.println("Insert number B:");
         int b = in.nextInt();
         
         number(a,b);
    }
    
    static void number (int a, int b) {

        int length1=0;
        int length2=0;
        while (a > 0) {
            a = a / 10;
            length1++;
        }
        while (b > 0) {
            b = b / 10;
            length2++;
        }

        if (length1>length2){ System.out.println("A > B");} else
            if (length1<length2 ){System.out.println("A < B");} else
            {System.out.println("A = B");}


    }
}
