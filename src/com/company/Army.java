package com.company;

public class Army {
    static int val = 0, gold = 5000, power = 0;
    static int[] stack = new int[10];

    static void push(int i) {
        stack[++val] = i;
        switch (i) {
            case 1: {
                System.out.println("Пехота добавлена в армию");
                gold = gold - 300;
                power = power + 100;
                System.out.println("Золота осталось:" + gold);
                System.out.println("Сила Армии:" + power);
                Menu.menu();
                break;
            }
            case 2: {
                System.out.println("Конница добавлена в армию");
                gold = gold - 500;
                power = power + 250;
                System.out.println("Золота осталось:" + gold);
                System.out.println("Сила Армии:" + power);
                Menu.menu();
                break;
            }
            case 3: {
                System.out.println("Лучники добавлены в армию");
                gold = gold - 250;
                power = power + 150;
                System.out.println("Золота осталось:" + gold);
                System.out.println("Сила Армии:" + power);
                Menu.menu();
                break;
            }
            case 4: {
                System.out.println("Маги добавлены в армию");
                gold = gold - 700;
                power = power + 400;
                System.out.println("Золота осталось:" + gold);
                System.out.println("Сила Армии:" + power);
                Menu.menu();
                break;
            }
            default:
                System.out.println("Неправильно. Повторите выбор");
                val--;
                Menu.menu();
                break;
        }


    }
}
