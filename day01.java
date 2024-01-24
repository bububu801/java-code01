package com;

import java.util.Scanner;

public class day01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入想要打印的等腰三角形的行数：");
        int a = sc.nextInt();
        showTriangle(a);
    }
    public static void showTriangle(int a){
        for(int i = 1; i <= a; ++i) {
            int j;
            for(j = a - i; j > 0; --j) {
                System.out.print(" ");
            }

            j = a - i;

            for(int k = 1; k + 2 * j <= 2 * a - 1; ++k) {
                System.out.print("*");
            }

            while(j > 0) {
                System.out.print(" ");
                --j;
            }

            System.out.print("\n");
        }

    }
}
