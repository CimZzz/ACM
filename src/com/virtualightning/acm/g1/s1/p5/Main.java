package com.virtualightning.acm.g1.s1.p5;

import java.util.Scanner;

/**
 * A+B for Input-Output Practice (V)
 * http://acm.hdu.edu.cn/game/entry/problem/show.php?chapterid=1&sectionid=1&problemid=3005
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rowCount = scanner.nextInt();
        int[] sumArr = new int[rowCount];

        for(int i = 0 ; i < rowCount ; i ++) {
            int count = scanner.nextInt();
            sumArr[i] = 0;
            for(int j = 0 ; j < count ; j ++)
                sumArr[i] += scanner.nextInt();
        }


        for(int i = 0 ; i < rowCount ; i ++)
            System.out.println(sumArr[i]);
    }
}
