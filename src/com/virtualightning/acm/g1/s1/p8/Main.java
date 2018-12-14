package com.virtualightning.acm.g1.s1.p8;


import java.util.Scanner;

/**
 * A+B for Input-Output Practice (VIII)
 * http://acm.hdu.edu.cn/game/entry/problem/show.php?chapterid=1&sectionid=1&problemid=3008
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isFirstLine = true;

        int rowCount = scanner.nextInt();

        for(int i = 0 ; i < rowCount ; i ++) {
            int count = scanner.nextInt();
            int sum = 0;
            for(int j = 0 ; j < count ; j ++)
                sum += scanner.nextInt();


            if(isFirstLine)
                isFirstLine = false;
            else System.out.println();
            System.out.println(sum);
        }
    }
}