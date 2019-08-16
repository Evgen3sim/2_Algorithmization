
/*Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади,
если угол между сторонами длиной X и Y— прямой.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Введите стороны треугольника x, y>0");
        double x = scn.nextFloat();
        double y = scn.nextFloat();

        double d = 0;

        double s = 0;

        double z = scn.nextInt();
        double t = scn.nextInt();


        while (x > 0 && y > 0){
            d = Math.sqrt(x*x+y*y);
            System.out.println("Введите длины других двух сторон >0 и z+t> " + d);
        }




        while ((z > 0) && (t > 0) && (z + t > d)){

            s = pl_pr(x,y) + pl_tr(z,t,d);
        }
        System.out.println("Площадь " + s);

    }

    public static double pl_pr(double x, double y){

    double pl = x * y / 2;
    return pl;

    }

    public  static double  pl_tr(double x, double y, double z){

        double p = 0;
        p = (x+y+z)/2;
        double plt = Math.sqrt(p * (p-x) * (p - y) * (p - z));
        return  plt;


    }
}
