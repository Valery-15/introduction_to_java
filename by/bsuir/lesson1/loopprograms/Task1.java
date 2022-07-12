package by.bsuir.lesson1.loopprograms;

import java.util.Scanner;

/*
 * 1. Напишите программу, где пользователь вводит любое целое положительное число.
 * А программа суммирует все числа от 1 до введенного пользователем числа.
 */

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int userNumber;

        do {
            System.out.print("Введите любое целое положительное число << ");
            while (!input.hasNextInt()) {
                input.nextLine();
                System.out.print("Введите любое целое положительное число << ");
            }
            userNumber = input.nextInt();
        } while (userNumber <= 0);

        int sumOfNumbers = 0;
        for(int i = 1; i <= userNumber; i++){
            sumOfNumbers += i;
        }
        System.out.println("Сумма чисел от 1 до " + userNumber + " равна " + sumOfNumbers);
    }
}
