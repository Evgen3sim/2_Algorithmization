package by.epam.method.task4;

import java.util.Scanner;

/*На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими
из пар точек самое большое расстояние. Указание. Координаты точек занести в массив.*/

public class Main {
    public static void main(String[] args) {
    	 
    	Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number of points: ");
       
         int n = sc.nextInt();
         int [] [] dots = new int [n] [2];

         for (int i = 0; i < n; i++) {
             System.out.println("Input x" + i);
             dots[i][0] = sc.nextInt();

             System.out.println("Input y" + i);
             dots[i][1] = sc.nextInt();
         }

         double [] result;
         result  = srch(0,0,0,0,n,dots);

         System.out.println("maximum distance between point " + result[0] + " between points " + result[1] +
                 " и " + result[2]);
     }


     private static  double[]  srch (double max, double firstMaxIndex, double secondMaxIndex, double distance, int n, int [] [] dots) {
         double [] result = new double[3];

         for (int i = 0; i < n; i++) {
             for (int j = 1; j <n; j++) {
                 distance = Math.sqrt(Math.pow(dots[i][0] - dots[j][1], 2) + Math.pow(dots[i][0] - dots[j][1], 2));
                 if (distance > max) {
                     max = distance;
                     firstMaxIndex = i;
                     secondMaxIndex = j;
                 }
             }
         }

         result[0] = max;
         result[1] = firstMaxIndex;
         result[2] = secondMaxIndex;

         return result;

    }
}
