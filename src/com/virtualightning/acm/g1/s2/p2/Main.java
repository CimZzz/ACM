package com.virtualightning.acm.g1.s2.p2;

import java.util.Locale;
import java.util.Scanner;

/**
 * Financial Management
 * http://acm.hdu.edu.cn/game/entry/problem/show.php?chapterid=1&sectionid=2&problemid=7
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float sum = 0;

        for(int i = 0 ; i < 12 ; i ++)
            if (scanner.hasNextFloat())
                sum += scanner.nextFloat();
            else return;

        sum /= 12;
        System.out.println(String.format(Locale.CHINA, "$%.2f", sum));
    }
}