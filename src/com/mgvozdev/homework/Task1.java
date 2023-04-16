package com.mgvozdev.homework;

import java.util.Scanner;

/**
 * Объявить три переменные типа String, назвать их firstName, secondName и fullName соответственно.
 *
 * Запросить данные для имени и фамилии у пользователя и получить их значение через ввод в терминале.
 *
 * Значение переменной fullName должно равняться сумме двух переменных, но не должно сливаться воедино, то есть
 * "Иван" "Иванов" -> "ИванИванов" - не верно
 * "Иван" "Иванов" -> "Иван Иванов" - верно
 */

public class Task1 {

    public static void main(String[] args) {

        String firstname;
        String secondName;
        String fullName;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя пользователя: ");
        firstname = scanner.nextLine();

        System.out.println("Введите фамилию пользователя: ");
        secondName = scanner.nextLine();

        fullName = firstname + " " + secondName;
        System.out.println("Полное имя пользователя: " + fullName);
    }
}
