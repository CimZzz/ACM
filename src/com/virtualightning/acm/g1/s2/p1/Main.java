package com.virtualightning.acm.g1.s2.p1;


import java.util.Scanner;

/**
 * A+B Coming
 * http://acm.hdu.edu.cn/game/entry/problem/show.php?chapterid=1&sectionid=2&problemid=3
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt(16)) {
            int num1 = scanner.nextInt(16);
            int num2 = scanner.nextInt(16);

            System.out.println(num1 + num2);
        }
    }
}