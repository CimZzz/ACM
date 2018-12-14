package com.virtualightning.acm.g1.s1.p4;
import java.util.Scanner;

/**
 * A+B for Input-Output Practice (IV)
 * http://acm.hdu.edu.cn/game/entry/problem/show.php?chapterid=1&sectionid=1&problemid=3004
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            int numCount = scanner.nextInt();
            if(numCount == 0)
                break;

            int sum = 0;
            for(int i = 0 ; i < numCount ; i ++)
                sum += scanner.nextInt();

            System.out.println(sum);
        }
    }
}
