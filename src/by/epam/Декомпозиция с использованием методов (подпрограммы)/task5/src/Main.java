
/*Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
которое меньше максимального элемента массива, но больше всех других элементов).*/

public class Main {
    public static void main(String[] args) {
        int[] array = {2, 6, 7, 10, 14, 3, 15};

        for (int num: array){
            System.out.print(num + " ");
        }

        FindMax(array);
    }

    public static void FindMax(int [] arr){
        int [] a = arr;
        int max = a[0];

        for (int i = 0; i < a.length; i++){
            if (a[i] > max){
                int temp = a[i];
                a[i] = max;
                max = temp;
            }
        }

        System.out.println();
        System.out.println("Max " + max);


        int second = 0;
        for (int i = 0; i < a.length; i++){
            second = a[0];
            if (a[i] < max && a[i] > second){
                int second2 = a[i];
                a[i] = second;
                second = second2;
            }
        }
        System.out.println("Второе " + second);

    }

}
