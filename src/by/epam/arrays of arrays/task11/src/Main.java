
/*. Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
которых число 5 встречается три и более раз.*/

public class Main {
    public static void main(String[] args) {

        int[][] array = new int[10][20];
        int[] row = new int[10];

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j ++){
                array[i][j] = (int)(Math.random() * 15) - 0;

            }
        }

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j ++){

                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        int k = 0;
        System.out.println("Строки в которых 5 больше 3 раз");
        for (int i = 0; i < array.length; i++){
            int count = 0;
            for (int j = 0; j < array.length; j ++){

            if (array[i][j] == 5){
                count++;
            }

            }
            if(count >= 3){
                k ++;
                row[k] = i;
                System.out.print(" stroka " + i);
                System.out.println();
            }
        }
    }
}
