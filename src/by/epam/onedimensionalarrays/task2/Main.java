import java.util.Scanner;

/*Дана последовательность действительных чисел а 1 ,а 2 ,..., а п . Заменить все ее члены, большие данного Z, этим
числом. Подсчитать количество замен.*/


public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter z");
        int z = scn.nextInt();
        System.out.println("Enter the dimension of the array");
        int size = scn.nextInt();
        int [] array = new int[size];

        int count = 0;

        System.out.println("Enter elements");


        for (int i = 0; i < array.length; i++){
            array[i] = scn.nextInt();
        }

        System.out.println("Source array");
        for (int i = 0; i < array.length; i++){
            System.out.println(" " + array[i]);
        }

        System.out.println("The resulting array");
        for (int i = 0; i < array.length; i++){
            if (z > array[i]){
               array[i] = z;
               count++;

            }
            System.out.println(" " + array[i]);
        }

        System.out.println("Number of replacements " + count);

    }
}
