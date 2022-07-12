package by.bsuir.lesson1.branchingprograms;

/*
 * 2. Найти max{min(a, b), min(c, d)}.
 */

public class Task2 {
    public static void main(String[] args) {
        double a = 10;
        double b = 13;
        double c = 9;
        double d = 0;

        double minAB = a < b ? a : b;
        double minCD = c < d ? c : d;

        double max;
        if (minAB > minCD) {
            max = minAB;
        } else {
            max = minCD;
        }
        System.out.println("a = " + a + ", b = " + b + ", c = " + c + ", d = " + d);
        System.out.println("min(a, b) = " + minAB + ", min(c, d) = " + minCD);
        System.out.println("max{min(a, b), min(c, d)} = " + max);
    }
}
