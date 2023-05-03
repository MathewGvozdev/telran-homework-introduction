package com.mgvozdev.homework;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstWord = scanner.nextLine();
        String secondWord = scanner.nextLine();
        System.out.println("Новое слово: " + returnNewWord(firstWord,secondWord));

        System.out.println("Результат сложения: " + addition(2.3, 5.1));
        System.out.println("Результат вычитания: " + subtraction(2.3, 5.1));
        System.out.println("Результат умножения: " + multiplication(2.3, 5.1));
        System.out.println("Результат деления: " + division(2.3, 5.1));

        convertCurrency(40.0, 0.94);

        System.out.println("Разница калорий для 28 см и 24 см: " + calorieCalculator() + " калл");

        System.out.println("Площадь круга: S = " + squareCalculator(2.7));
        System.out.println("Площадь прямоугольника: S = " + squareCalculator(2.7, 6.2));
        System.out.println("Площадь треугольника: S = " + squareCalculator(2.7, 8.1, 6.2));

        System.out.println("Получение символов под индексами со строки: " + getChars("STRING", 1, 5));
    }

    //Получите слово, состоящее из первой половины первого слова и второй половины второго слова.
    static String returnNewWord(String firstWord, String secondWord) {
        String firstHalf = firstWord.substring(0, firstWord.length() / 2);
        String secondHalf = secondWord.substring(secondWord.length() / 2);
        return firstHalf + secondHalf;
    }

    //Реализовать программу, которая выводит на экран результаты сложения, вычитания, умножения и деления двух чисел.
    //Каждая из арифметических операций должна быть реализована как отдельный метод.
    //Каждый отдельный метод принимает в качестве аргументов два числа и возвращает то же число
    static double addition(double number1, double number2) {
        return number1 + number2;
    }

    static double subtraction(double number1, double number2) {
        return number1 - number2;
    }

    static double multiplication(double number1, double number2) {
        return number1 * number2;
    }

    static double division(double number1, double number2) {
        return number1 / number2;
    }

    //реализовать метод, который конвертирует указанную сумму в евро в сумму в долларах США
    static void convertCurrency(double euro, double currentRate) {
        double usd = euro * currentRate;
        System.out.printf("При курсе %.2f USD за один EUR, при обмене %.2f EUR, вы получите %.2f USD\n", currentRate, euro, usd);
    }

    //Напишите программу, которая подсчитает, сколько дополнительных калорий будет, если вы купите пиццу диаметром
    //28 см вместо пиццы диаметром 24 см. Чтобы решить эту проблему, давайте предположим, что в каждом квадратном
    //сантиметре пиццы содержится 40 калорий. Метод возвращает ЦЕЛОЕ число калорий.
    static int calorieCalculator() {
        int pizzaDiameter28 = 28;
        int pizzaDiameter24 = 24;
        int calorie28 = (int) (Math.PI * (pizzaDiameter28 / 2) * (pizzaDiameter28 / 2) * 40);
        int calorie24 = (int) (Math.PI * (pizzaDiameter24 / 2) * (pizzaDiameter24 / 2) * 40);
        return calorie28 - calorie24;
    }

    //напишите методы для подсчета площади трех фигур
    static double squareCalculator(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    static double squareCalculator(double a, double b) {
        return a * b;
    }

    static double squareCalculator(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    //реализовать метод getChars, которы принимает строку и два числа, при этом возвращает строку, состоящую из символов,
    //стоящих под этими индексами
    static String getChars(String str, int firstIndex, int secondIndex) {
        char firstSymbol = str.charAt(firstIndex);
        char secondSymbol = str.charAt(secondIndex);
        return Character.toString(firstSymbol) + secondSymbol;
    }
}
