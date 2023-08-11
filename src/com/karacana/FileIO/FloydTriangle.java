package com.karacana.FileIO;

import java.util.Scanner;

public class FloydTriangle {

    public static void main(String[] args) {
        System.out.println("Enter the number of rows of Floyd's Triangle");
        Scanner scanner = new Scanner(System.in);
        int num = 1;
        int  number = scanner.nextInt();

        System.out.println("Floyd's triangle: ");

        for (int i = 1; i < number; i++) {
            for (int j = 1; j < i + 1; j++) {

                System.out.print( num  +  " ");
                num++;

        }
            System.out.println();
        }
    }
}

