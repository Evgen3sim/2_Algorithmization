package by.epam.sort.task5;

/*Сортировка вставками. Дана последовательность чисел a 1 , a 2 ,  , a n . Требуется переставить числа в порядке
возрастания. Делается это следующим образом. Пусть a 1 , a 2 ,  , a i - упорядоченная последовательность, т. е.
a 1  a 2    a n . Берется следующее число a i + 1 и вставляется в последовательность так, чтобы новая
последовательность была тоже возрастающей. Процесс производится до тех пор, пока все элементы от i +1 до n
не будут перебраны. Примечание. Место помещения очередного элемента в отсортированную часть производить
с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.*/

public class Main {
    public static void main(String[] args) {

        int[] array = {5, 7, 9, 3, 1, 4, 2};

        for (int num: array){
            System.out.print(num + " ");
        }

        Sort(array);

        System.out.println();
        for (int num: array){
            System.out.print(num + " ");
        }


    }

        public static void Sort(int array[]){
        int j,temp;
        for (int i = 0; i < array.length; i++){
            temp = array[i];
            for (j = i -1; j >= 0 && array[j] > temp; j--){ // для убывния меняем знак array[i] < temp
                array[j+1]= array[j];
            }

            array[j+1] = temp;
        }
    }
}
