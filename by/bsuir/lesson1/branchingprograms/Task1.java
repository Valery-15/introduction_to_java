package by.bsuir.lesson1.branchingprograms;

/*
 * 1. Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник,
 * и если да, то будет ли он прямоугольным.
 */

public class Task1 {
    public static void main(String[] args) {
        double firstAngle = 190;
        double secondAngle = 10;

        if ((firstAngle + secondAngle) < 180) {
            System.out.println("Треугольник с двумя углами равными " + firstAngle + " и " + secondAngle + " существует.");

            double thirdAngle = 180 - firstAngle - secondAngle;

            if (firstAngle == 90 || secondAngle == 90 || thirdAngle == 90) {
                System.out.println("Треугольник является прямоугольным.");
            } else {
                System.out.println("Треугольник не является прямоугольным.");
            }
        } else {
            System.out.println("Треугольник с двумя углами равными " + firstAngle + " и " + secondAngle + " не существует.");
        }
    }
}
