
/*Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов
массива с номерами от k до m.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Размер массива");
        int size = scn.nextInt();

        int [] array = new int[size];

        for (int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random() * 10) - 0;
        }
        System.out.println("Массив");
        for (int num: array){
            System.out.print(num + " ");
        }

        Sum(array);

    }

    public static void Sum(int [] arr){

        int count = 0;
        int sum = 0;
        for (int i = 0; i < arr.length ; i ++){
            sum = sum + arr[i];
            count++;
            if (count == 3){
                System.out.println();
                System.out.println("Sum " + sum );
                count = 0;
                break;
            }

        }


    }
}
