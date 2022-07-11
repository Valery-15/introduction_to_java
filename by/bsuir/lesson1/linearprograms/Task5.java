package by.bsuir.lesson1.linearprograms;

/*
 * 5. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
 * Вывести данное значение длительности в часах, минутах и секундах в следующей форме: НН ч ММ мин SS c.
 */

public class Task5 {
    public static void main(String[] args) {
        int time = 7208;

        int hours, minutes, seconds;

        hours = time / 3600;
        minutes = (time % 3600) / 60;
        seconds = time - 3600 * hours - 60 * minutes;

        System.out.println("Длительность прошедшего времени \nв секундах: " + time + " с " +
                "\nв форме НН ч ММ мин SS c: " + hours + " ч " + minutes + " мин " + seconds + " с.");

    }
}
