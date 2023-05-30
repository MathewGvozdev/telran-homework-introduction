package com.mgvozdev.homework;

import java.util.Scanner;

public class Task7 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите строку: ");
        String str = scanner.nextLine();
        System.out.println("Введите символ: ");
        String symbol = scanner.nextLine();
        if (symbol.length() == 1) {
            System.out.println("Символ '" + symbol + "' повторяется " + countOccurrences(str, symbol.charAt(0)) + " раз");
        } else {
            System.out.println("Неверные данные");
        }

        System.out.println("Сумма точных квадратов от 1 до 1000 равна: " + countSumOfPerfectSquares());
    }

    //Напишите программу, которая принимает строку и символ и возвращает количество вхождений этого символа в строку:
    private static int countOccurrences(String str, char symbol) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == symbol) {
                count++;
            }
        }
        return count;
    }

    //Напишите программу, которая вычисляет сумму всех чисел точных квадратов от 1 до 1000.
    private static int countSumOfPerfectSquares() {
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            if (isPerfectSquare(i)) {
                sum += i;
            }
        }
        return sum;
    }

    public static boolean isPerfectSquare(int number) {
        int sqrt = (int) Math.sqrt(number);
        return sqrt * sqrt == number;
    }
}
