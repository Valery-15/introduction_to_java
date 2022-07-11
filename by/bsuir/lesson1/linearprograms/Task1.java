package by.bsuir.lesson1.linearprograms;

/*
* 1. Найдите значение функции:  z = ((a - 3) * b / 2) + c.
*/
public class Task1 {
    public static void main(String[] args) {
        double a = -1.0;
        double b = 2.5;
        double c = 12.5;

        double z;
        z = ((a - 3) * b / 2) + c;

        System.out.println("Значение функции  z = ((a - 3) * b / 2) + c при a = " +
                + a + ", b = " + b + ", c = " + c + " равно " + z);

    }
}
