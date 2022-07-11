package by.bsuir.lesson1.linearprograms;

/*
 *2. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
 *  (b + sqrt(b^2 + 4ac) / (2a) - a^3 * c - b^(-2);
 */
public class Task2 {
    public static void main(String[] args) {
        double a = -1.0;
        double b = 2.5;
        double c = 12.5;

        double result;
        result = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c - Math.pow(b, -2);
        System.out.println("Значение выражения при a = " + a + ", b = " + b + ", c = " + c + " равно " + result);
    }
}
