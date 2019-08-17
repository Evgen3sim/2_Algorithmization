
/*Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.*/

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner (System.in);
        System.out.println("Enter n");

        int size = scn.nextInt();

        int array[] = new int[size];

        for (int i = 0; i < array.length; i++){
            array[i] = (int)((Math.random() * 30) - 15);
        }
        System.out.println("Array");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        for (int i = 0; i < array.length; i++){
            if(i % 2 == 0){
                array[i] = 0;
            }
        }
        System.out.println(" ");
        System.out.println("new array");
        for (int i = 1; i < array.length; i++){
            System.out.print(array[i] + " ");
        }

    }
}
