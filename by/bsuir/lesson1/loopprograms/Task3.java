package by.bsuir.lesson1.loopprograms;

/*
 * 3. Найти сумму квадратов первых ста чисел.
 */

public class Task3 {
    public static void main(String[] args) {
        int sumOfSquareNumbers = 0;
        for(int i = 1; i <= 100; i++){
            sumOfSquareNumbers += i*i;
        }
        System.out.println("Сумма квадратов первых ста чисел равна " + sumOfSquareNumbers);
    }
}
