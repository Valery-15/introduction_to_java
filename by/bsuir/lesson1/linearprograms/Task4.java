package by.bsuir.lesson1.linearprograms;

/*
 * 4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
 * Поменять местами дробную и целую части числа и вывести полученное значение числа.
 */

public class Task4 {
    public static void main(String[] args) {
        double number = 999.555;

        int integerPartOfNumber;
        integerPartOfNumber = (int) number;
        int digitFromIntegerPartOfNumber;
        digitFromIntegerPartOfNumber = integerPartOfNumber % 10;

        int digitFromFractionalPartOfNumber;
        digitFromFractionalPartOfNumber = (int) (number * 10) % 10;

        double resultNumber;
        resultNumber = digitFromFractionalPartOfNumber * 111 + digitFromIntegerPartOfNumber * 0.111;

        System.out.println("Исходное действительное число вида nnn.ddd : " + number
                + "\nПолученное действительное число вида ddd.nnn : " + resultNumber);
    }
}
