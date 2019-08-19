package by.epam.sort.task4;

/*Сортировка обменами. Дана последовательность чисел a 1  a 2    a n .Требуется переставить числа в
порядке возрастания. Для этого сравниваются два соседних числа a i и a i + 1 . Если a i  a i + 1 , то делается
перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
Составить алгоритм сортировки, подсчитывая при этом количества перестановок.*/

public class Main {
    public static void main(String[] args) {

        int[] array = {9,5,7,3,2,4,6};

        for (int i = 0; i < array.length; i ++){
            System.out.print(array[i] + " ");
        }

        int count;
        do {
            count = 0;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    count++;
                }
            }
        } while (count > 0);
        System.out.println();
        for (int num: array){
            System.out.print(num + " ");
        }
    }
}
