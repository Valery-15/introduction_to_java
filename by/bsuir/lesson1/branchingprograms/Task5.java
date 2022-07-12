package by.bsuir.lesson1.branchingprograms;

/*
 * 5. Вычислить значение функции:
 * F(x) = x^2 - 3x + 9, если x<=3
 * F(x) = 1 / (x^3 + 6), если x>3
 */

public class Task5 {
    public static void main(String[] args) {
        double x = 15;

        double functionValue;

        if (x <= 3) {
            functionValue = Math.pow(x, 2) - 3 * x + 9;
            System.out.println("x = " + x + " <= 3, значение функции F(x) = x^2 - 3x + 9 = " + functionValue);
        } else {
            functionValue = 1 / (Math.pow(x, 3) + 6);
            System.out.println("x = " + x + " > 3, значение функции F(x) = 1 / (x^3 + 6) = " + functionValue);
        }
    }
}
