package com.company;

public class Fight {
    static void fight( int i, int y)
    {
        if (i>y) System.out.println("Победа первого игрока");
        else if (i<y) System.out.println("Победа второго игрока");
        else System.out.println("Ничья");
    }
}
