package by.epam.method.task3;

import java.util.Scanner;

/*Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади
треугольника.*/

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter side size ");
        int a = scn.nextInt();
        System.out.println("Side = " + a);
        Plosha(a);

    }

    public static void Plosha(int a){
        double s = (3 * a * a  * (Math.sqrt(3)))/2;
        System.out.println("Hexagon area " + s);
    }
}
