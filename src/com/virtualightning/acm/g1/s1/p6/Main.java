package com.virtualightning.acm.g1.s1.p6;

import java.util.Scanner;

/**
 * A+B for Input-Output Practice (VI)
 * http://acm.hdu.edu.cn/game/entry/problem/show.php?chapterid=1&sectionid=1&problemid=3006
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNextInt()) {
            int count = scanner.nextInt();
            int sum = 0;
            for(int j = 0 ; j < count ; j ++)
                sum += scanner.nextInt();

            System.out.println(sum);
        }
    }
}
