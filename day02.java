package com;

import java.util.Scanner;

public class day02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入一个正整数：");
        //int a=sc.nextInt();
        String s;
        s=sc.next();
        reverseSUM(s);
    }
    public static void reverseSUM(String s){
        char[] chars=s.toCharArray();
        int n= chars.length;
        System.out.println("您输入的正整数的位数是："+n);
        char t;
        for (int i=0;i<=(n-1)/2;i++){
            t=chars[i];
            chars[i]=chars[n-i-1];
            chars[n-i-1]= t;
        }
        s=String.valueOf(chars);
        System.out.println("您输入的正整数的逆序是："+s);
    }
}
