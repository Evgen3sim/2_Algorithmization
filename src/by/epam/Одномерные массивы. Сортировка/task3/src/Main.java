
/*Сортировка выбором. Дана последовательность чисел a 1  a 2    a n .Требуется переставить элементы так,
чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
повторяется. Написать алгоритм сортировки выбором.*/

public class Main {
    public static void main(String[] args) {

        int [] array = {6,2,4,7,5,3,1};

        int min, tmp;


        for (int i = 0; i < array.length-1;i++){
            min = i;
            for (int scan = i + 1;scan < array.length; scan++ ){
                if (array[scan] < array[min]){
                    min = scan;
                }
            }
            tmp = array[min];
            array[min] = array[i];
            array[i] = tmp;

            System.out.print(array[i] + " ");
        }


    }
}
