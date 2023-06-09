package com.mgvozdev.homework;

import java.util.Scanner;

/**
 * Ваш бот будет работать в почтовом отделении и служить для того, чтобы заранее заполнить все поля и выдать готовый
 * квиток для отправления посылки. Посылка может быть сборной, но обязательно из одинаковых коробок одинакового веса,
 * поэтому мы спрашиваем нашего пользователя:
 *
 * - сколько коробок вы хотите отправить?
 * > при помощи сканнера считать количество коробок <
 *
 * - сколько весит каждая коробка в киллограммах?
 * > при помощи сканнера считать вес коробки. Дробное число <
 *
 * Введите имя получателя посылки на этом этапе могут возникнуть ошибки при считывании строки после считвания числа,
 * то есть считается пустая строка, проверьте и подумайте, как это решить
 *
 * > при помощи сканнера считать имя получателя <
 *
 * Введите фамилию получателя посылки при помощи сканнера считать фамилию получателя <
 * Введите адрес получателя посылки при помощи сканнера считать адрес получателя <
 *
 * После чего ваш бот должен написать следующее сообщение:
 * Получатель: "…"    // подумайте, как распечатать ковычки
 * Адрес получателя: "…" // имя и адрес получателя должны быть выведены в верхнем регистре,
 * // даже если пользователь ввел их в нижнем регистре
 * вес посылки: … кг // общий вес всей посылки, а не отдельной коробки
 *
 * - Все верно?
 * > при помощи сканнера считать ответ получателя в переменную типа boolean <
 */

public class Task2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Сколько коробок вы хотите отправить?\n> ");
        int boxNumber = scanner.nextInt();

        System.out.print("Сколько весит каждая коробка в килограммах?\n> ");
        double boxWeight = scanner.nextDouble();

        System.out.print("Введите имя получателя\n> ");
        scanner.nextLine();
        String name = scanner.nextLine();

        System.out.print("Введите фамилию получателя\n> ");
        String surname = scanner.nextLine();

        System.out.print("Введите адрес получателя\n> ");
        String address = scanner.nextLine();

        String botRespondFormat = "Получатель: \"%s\"\nАдрес получателя: \"%s\"\nВес посылки: %.2f кг\n";
        String fullName = name + " " + surname;
        double totalWeight = boxNumber * boxWeight;
        System.out.printf(botRespondFormat, fullName.toUpperCase(), address.toUpperCase(), totalWeight);

        System.out.print("Все верно?\n> ");
        boolean isCorrect = scanner.nextBoolean();
        if (isCorrect) {
            System.out.println("Заказ подтвержден");
        } else {
            System.out.println("Введите данные заново");
        }
    }
}
