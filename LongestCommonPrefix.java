package No2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LongestCommonPrefix {
    @org.jetbrains.annotations.NotNull
    @org.jetbrains.annotations.Contract(pure = true)
    public void LongestCommonPrefix(){
        int n=1000;
        System.out.println("请输入字符串的个数");
        Scanner sc=new Scanner(System.in);
        int x= sc.nextInt();
        String[] strs=new String[x];
        for(int i=0;i<=x-1;i++){
            strs[i]=sc.next();
            if(strs[i].length()<n){
                n=strs[i].length();
            }
        }
        System.out.println(longestCommonPrefix(strs,x,n));
    }
    public static String longestCommonPrefix(String[] strs,int x,int n){
        String ans="";
        for(int i=0;i<=n-1;i++){
            int a=0;
            for(int j=1;j<=x-1;j++){
                if(strs[0].charAt(i)==strs[j].charAt(i)){
                    a++;
                }
                if(a==x-1){
                    ans+=strs[0].charAt(i);

                }
            }

        }
        return ans;
    }
}
