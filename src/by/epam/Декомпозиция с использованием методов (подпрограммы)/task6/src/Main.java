
/*Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Введите 3 простых числа");
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();

        if (Vzaim(Vzaim(a,b),c) == 1){
            System.out.println("Взаимно");
        }else {
            System.out.println("Не взаимно");
        }
    }

    public static int Vzaim(int a, int b){
        while (a != b){
            if (a > b){
                a = a - b;
            } else
            {
                b = b - a;
            }
        }
        return a;

    }
}
