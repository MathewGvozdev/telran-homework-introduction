package com.mgvozdev.homework;

public class Task5 {

    public static void main(String[] args) {
        int number = 4;
        checkNumber(number);

        checkEvenOdd(number);

        int studentScore = 78;
        System.out.println("Оценка студента с баллом " + studentScore + " равна " + evaluateGrade(studentScore));
    }

    //Напишите метод, который проверяет, является ли заданное число положительным, отрицательным или нулём и печатает
    // ответ в консоль
    static void checkNumber(int number) {
        if (number > 0) {
            System.out.println(number + " является положительным числом.");
        } else if (number < 0) {
            System.out.println(number + " является отрицательным числом.");
        } else {
            System.out.println("Число равно нулю.");
        }
    }

    //Напишите метод, который определяет, является ли заданное число чётным или нечётным и печатает ответ в консоль
    public static void checkEvenOdd(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " является чётным числом.");
        } else {
            System.out.println(number + " является нечётным числом.");
        }
    }

    //Напишите метод, который определяет оценку студента в зависимости от полученного балла:
    //90-100 - A, 80-89 - B, 70-79 - C, 60-69 - D, меньше 60 - F.
    //Метод принимает число в качестве аргумента и возвращает строку
    public static String evaluateGrade(int score) {
        if (score >= 90 && score <= 100) {
            return "A";
        } else if (score >= 80 && score <= 89) {
            return "B";
        } else if (score >= 70 && score <= 79) {
            return "C";
        } else if (score >= 60 && score <= 69) {
            return "D";
        } else {
            return "F";
        }
    }
}
