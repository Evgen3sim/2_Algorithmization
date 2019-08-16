
/*Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
Делается это следующим образом: сравниваются два соседних элемента a i и a i + 1 . Если a i  a i + 1 , то продвигаются
на один элемент вперед. Если a i  a i + 1 , то производится перестановка и сдвигаются на один элемент назад.
Составить алгоритм этой сортировки.*/

public class Main {
    public static void main(String[] args) {

        int[] array = {5, 4, 7, 8, 9, 6, 3, 2, 0, 1};

        for (int num: array){
            System.out.print(num + " ");
        }

        int d = array.length / 2;
        while (d > 0){
            for (int i = 0; i < array.length - d; i++){
                int j = i;
                while ((j >= 0) && (array[j] > array[j + d])){
                    int temp =  array[j];
                    array[j] = array[j + d];
                    array[j + d] = temp;
                    j--;
                }
            }
            d = d/2;
        }

        System.out.println();
        for (int num: array){
            System.out.print(num + " ");
        }

    }
}
