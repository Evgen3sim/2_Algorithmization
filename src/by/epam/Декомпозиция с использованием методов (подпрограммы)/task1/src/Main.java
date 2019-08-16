
/*Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
натуральных чисел:
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Введите два числа");
        int a = scn.nextInt();
        int b = scn.nextInt();
        System.out.println("Наибольший общий делитель");
        Nod(a,b);


    }


    public static void  Nod (int a, int b){

        int c = a * b;
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else
                b = b - a;
        }


        int nok = c / a;

        System.out.println(a);
        System.out.println("Наименьшнн общее кратное");
        System.out.println(nok);



    }
}
