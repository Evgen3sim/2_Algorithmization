
/*Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади
треугольника.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Введите сторону шестиугольника");
        int a = scn.nextInt();
        System.out.println("Сторона шестиугольника " + a);
        Plosha(a);

    }

    public static void Plosha(int a){


        double s = (3 * a * a  * (Math.sqrt(3)))/2;
        System.out.println("Площадь шестиугольника " + s);
    }
}
