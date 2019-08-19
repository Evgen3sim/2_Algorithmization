package by.epam.method.task2;

import java.util.Scanner;

/*Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.*/

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        int d = scn.nextInt();

        int nod = Nod(a,b);
        int nod2 = Nod(c,d);
        int nod3 = Nod(nod,nod2);

        System.out.println("NOD " + nod3);

    }

    public static int  Nod(int m, int n){

        while (m != n){
            if (m > n){
                m = m - n;
            }else
            {
                n = n - m;
            }
        }
        return m;

    }
}
