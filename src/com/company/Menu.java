package com.company;

import java.util.Scanner;

public class Menu {
    static Players newplayer1 = new Players();
    static Players newplayer2 = new Players();
    static void menu ()
    {
        int i=0;
        if (Army.val < 5&&Army.gold>700) {
            Scanner in = new Scanner(System.in);
            System.out.println("Выбор войск:");
            System.out.println("1. пехота 300 голды");
            System.out.println("2. конница 500 голды");
            System.out.println("3. лучники 250 голды");
            System.out.println("4. маги 700 голды");
            i = in.nextInt();
            Army.push(i);
        }
        else {
            System.out.println("Армия укомплектована");
            System.out.println("Сила Армии:" + Army.power);
            if (newplayer1.power==0) {
            newplayer1.power=Army.power;
                Army.val=0;
                Army.gold=5000;
                Army.power=0;
                System.out.println("Выбор армии второго игрока");
                menu();
            }
            else {
                newplayer2.power=Army.power;
                System.out.println("Набор окончен");
                System.out.println("Сила армии первого игрока" + newplayer1.power);
                System.out.println("Сила армии второго игрока" + newplayer2.power);
                Fight.fight(newplayer1.power,newplayer2.power);
            }
        }
    }
}
