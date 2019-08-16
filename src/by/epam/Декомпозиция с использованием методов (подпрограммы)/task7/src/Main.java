
/*Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.*/

public class Main {
    public static void main(String[] args) {

        int [] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        Sum(array);

    }

    public static void Sum(int [] arr){
        int [] a = arr;

        int sum = 0;
        int factorial = 1;

        for (int i = 2; i < a.length + 1; i++){
            factorial = factorial * i;
            System.out.println(i + " = " + factorial);
            sum = sum + factorial;
        }

        ;
        System.out.println("Sum " + sum);
    }
}
