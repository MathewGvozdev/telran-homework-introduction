package com.mgvozdev.homework;

import java.util.Scanner;

public class Task8 {

    private static final int A_GRADE_INDEX = 0;
    private static final int B_GRADE_INDEX = 1;
    private static final int C_GRADE_INDEX = 2;
    private static final int D_GRADE_INDEX = 3;
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Высота H = ");
        int totalFloors = scanner.nextInt();
        System.out.println("Подъем N = ");
        int stepUp = scanner.nextInt();
        System.out.println("Спуск M = ");
        int stepDown = scanner.nextInt();
        int lifts = numberOfLifts(totalFloors, stepUp, stepDown);
        System.out.printf("Лифт подымется на %d этаж за %d подъемов\n", totalFloors, lifts);

        System.out.println("Введите количество учеников: ");
        int numberOfStudents = scanner.nextInt();
        scanner.nextLine();
        int[] grades = counter(numberOfStudents);
        int gradeA = grades[A_GRADE_INDEX];
        int gradeB = grades[B_GRADE_INDEX];
        int gradeC = grades[C_GRADE_INDEX];
        int gradeD = grades[D_GRADE_INDEX];
        System.out.printf("Количество оценок:\nА: %d\nB: %d\nC: %d\nD: %d\n", gradeA, gradeB, gradeC, gradeD);
    }

    // Лифт, находящийся на первом этаже здания высотой H, должен подняться на последний этаж. Лифт сломан.
    // Каждый раз он поднимается на N этажей и спускается на M этажей. Если на последнем подъеме лифт превысил
    // количество этажей, то считается что лифт поднялся на самый верх. Найдите количество подъемов, которые понадобятся лифту.
    private static int numberOfLifts(int floor, int stepUp, int stepDown) {
        int totalLifts = 0;
        int currentFloor = 0;

        while (true) {
            totalLifts++;
            currentFloor += stepUp;
            if (currentFloor >= floor) {
                break;
            }
            currentFloor -= stepDown;
        }
        return totalLifts;
    }

    //В классе N учеников, по завершению теста диктуются оценки A, B, C или D. Необходимо посчитать количество каждых оценок.
    private static int[] counter(int numberOfStudents) {
        int[] countArray = new int[4];
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Введите оценку для ученика " + (i + 1) + ": ");
            char grade = scanner.nextLine().charAt(0);

            switch (grade) {
                case 'A' -> countArray[A_GRADE_INDEX]++;
                case 'B' -> countArray[B_GRADE_INDEX]++;
                case 'C' -> countArray[C_GRADE_INDEX]++;
                case 'D' -> countArray[D_GRADE_INDEX]++;
                default -> {
                    System.out.println("Оценка недопустима. Попробуйте еще раз.");
                    i--;
                }
            }
        }
        return countArray;
    }
}
