package by.bsuir.lesson1.linearprograms;

/*
 * 3. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
 * (𝑠𝑖𝑛 𝑥 + 𝑐𝑜𝑠 𝑦)/(𝑐𝑜𝑠 𝑥 − 𝑠𝑖𝑛 𝑦) ∗ 𝑡𝑔 𝑥𝑦
 */
public class Task3 {
    public static void main(String[] args) {
        double x = 1.0;
        double y = 2.0;

        double result;
        result = (Math.sin(x) + Math.cos(y)) * Math.tan(x * y) / (Math.cos(x) - Math.sin(y));
        System.out.println("Значение выражения при x = " + x + ", y = " + y + " равно " + result);
    }
}
