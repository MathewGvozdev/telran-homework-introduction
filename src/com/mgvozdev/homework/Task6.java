package com.mgvozdev.homework;

/**
 * Напишите метод, который принимает на вход номер значение месяца enum и выводит количество дней в этом месяце.
 * Необходимо написать enum с перечислением всех месяцев.
 * Количество дней в феврале 28.
 */

public class Task6 {

    public static void main(String[] args) {
        Month month1 = Month.FEBRUARY;
        Month month2 = Month.JUNE;
        Month month3 = Month.DECEMBER;
        printDaysInMonth(month1);
        printDaysInMonth(month2);
        printDaysInMonth(month3);
    }

    static void printDaysInMonth(Month month) {
        switch (month) {
            case FEBRUARY -> System.out.println("В этом месяце 28 дней");
            case JANUARY, MARCH, MAY, JULY, AUGUST, OCTOBER, DECEMBER -> System.out.println("В этом месяце 31 день");
            case APRIL, JUNE, SEPTEMBER, NOVEMBER -> System.out.println("В этом месяце 30 дней");
        }
    }

    enum Month {
        JANUARY, FEBRUARY,
        MARCH, APRIL, MAY,
        JUNE, JULY, AUGUST,
        SEPTEMBER, OCTOBER, NOVEMBER,
        DECEMBER
    }
}
