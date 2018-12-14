package com.virtualightning.acm.g1.s1.p3;

import java.util.Scanner;

/**
 * A+B for Input-Output Practice (III)
 * http://acm.hdu.edu.cn/game/entry/problem/show.php?chapterid=1&sectionid=1&problemid=3003
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNextInt()) {
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();

            if(num1 == 0 && num2 == 0)
                break;

            System.out.println(num1 + num2);
        }
    }
}
