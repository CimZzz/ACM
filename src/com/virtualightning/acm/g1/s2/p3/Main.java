package com.virtualightning.acm.g1.s2.p3;


import java.util.Scanner;

/**
 * An Easy Task
 * http://acm.hdu.edu.cn/game/entry/problem/show.php?chapterid=1&sectionid=2&problemid=10
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rowNum = scanner.nextInt();

        for(int i = 0 ; i < rowNum ; i ++) {
            int currentYear = scanner.nextInt();
            int ageCount = scanner.nextInt();

            int nextYear = 0;
            for(int j = currentYear; !((j % 4 == 0 && j % 100 != 0) || j % 400 == 0) ; j ++)
                nextYear ++;

            System.out.println(nextYear);

            System.out.println(processAge(currentYear + nextYear, ageCount * 4));
        }
    }

    private static int processAge(int startYear, int addYear) {
        if(addYear == 0)
            return startYear;

        int avoid = 0;
        int endYear = startYear + addYear;


        int startYearRemainder = startYear / 100;
        int endYearRemainder = endYear / 100;

        for(int i = startYearRemainder ; i < endYearRemainder ; i ++) {
            if(i % 4 == 0)
                continue;

            if((i * 100) % 4 == 0)
                avoid ++;
        }

        return processAge(endYear, avoid * 4);
    }
}