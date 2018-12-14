package com.virtualightning.acm.g1.s1.p2;

import java.util.Scanner;

/**
 * A+B for Input-Output Practice (II)
 * http://acm.hdu.edu.cn/game/entry/problem/show.php?chapterid=1&sectionid=1&problemid=3002
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] sumArr = new int[count];

        for(int i = 0 ; i < count ; i ++) {
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();

            sumArr[i] = num1 + num2;
        }


        for(int i = 0 ; i < count ; i ++)
            System.out.println(sumArr[i]);
    }
}
