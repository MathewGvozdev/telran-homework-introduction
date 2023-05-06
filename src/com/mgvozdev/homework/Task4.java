package com.mgvozdev.homework;

public class Task4 {

    public static void main(String[] args) {
        boolean isWeekend = true;
        boolean isRain = true;
        System.out.println(canWalk(isWeekend, isRain));

        boolean isEdekaOpen = false;
        boolean isReweOpen = true;
        canBuy(isEdekaOpen, isReweOpen);

        int temperature1 = 149;
        int temperature2 = 74;
        doesDeviceWorkCorrectly(temperature1, temperature2);

        convertTime(20000);
    }

    // Создайте две переменные isWeekend и isRain. Создайте переменную canWalk, значение которой должно быть истинным,
    // если это выходной день (isWeekend=true) и не идет дождь (isRain=false).
    static boolean canWalk(boolean isWeekend, boolean isRain) {
        boolean canWalk = isWeekend && isRain;
        return canWalk;
    }

    // Создайте две переменные isEdekaOpen и isReweOpen, значения которых зависят от того, открыты магазины или нет.
    // Реализует логический метод canBuy, возвращающий true ** Значение этой переменной должно быть true, если хотя
    // бы один магазин открыт, иначе false. Отобразите строку «Я могу купить еду, это ……» и значение.
    static void canBuy(boolean isEdekaOpen, boolean isReweOpen) {
        boolean canBuy = isEdekaOpen || isReweOpen;
        System.out.println("Я могу купить еду, это " + canBuy);
    }

    // Представим, что у нас есть устройство, в котором две колбы. Прибор работает корректно, если температура
    // первой колбы выше 100 градусов, а температура второй колбы меньше 100 градусов. Вы должны написать метод,
    // который проверяет это устройство. Ваша программа должна иметь переменные Temperature1 и Temperature2.
    // В результате он выводит сообщение true или false.
    static void doesDeviceWorkCorrectly(int temperature1, int temperature2) {
        boolean firstCondition = temperature1 > 100;
        boolean secondCondition = temperature2 < 100;
        boolean result = firstCondition && secondCondition;
        System.out.println("Прибор работает корректно: " + result);
    }

    // Есть устройство, на табло которого показывается количество секунд, оставшихся до конца рабочего дня.
    // Когда рабочий день начинается ровно в 9 часов утра — табло отображает «28800» (т.е. остаётся 8 часов),
    // когда 14:30 — на табло «9000» (т.е. остаётся два с половиной часа), а когда наступает 17 часов — на табло
    // отображается «0» (т.е. рабочий день закончился).
    // Некоторый сотрудники не умеют оценивать остаток рабочего дня в секундах.
    // Итак: требуется написать программу, которая вместо секунд будет выводить на табло понятные фразы с
    // информацией о том, сколько полных часов осталось до конца рабочего дня.
    static void convertTime(int seconds) {
        if (seconds >= 0 && seconds <= 28800) {
            int hours = seconds / 3600;
            int minutes = seconds / 60 - hours * 60;
            System.out.println("До конца рабочего дня осталось " + seconds + " секунды");
            System.out.println("До конца рабочего дня осталось " + hours + " часов " + minutes + " минут");
        } else {
            System.out.println("Ошибка. Количество секунд вне диапазона");
        }
    }
}
