package No2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calcuator {
    double a,b;
    String a1,b1;
    Scanner sc=new Scanner(System.in);
    public void Calcuator(){
        System.out.println("请选择以下操作");
        System.out.println("1.add 2.subtract 3.multiply 4.divide");
        int x=sc.nextInt();
        System.out.println("请输入两个数字：");
        if(x==1){
            a1=sc.next();
            b1=sc.next();
        }else {
            a = sc.nextDouble();
            b = sc.nextDouble();
        }
        switch (x){
            case 1:

                getSum(a1,b1);
                break;
            case 2:
                System.out.println(subtract(a, b));
                break;
            case 3:
                System.out.println(multiply(a, b));
                break;
            case 4:
                System.out.println(divide(a, b));
                break;
            default:
                System.out.println("输入错误");
                break;
        }
    }
    public double subtract(double a,double b){
        return a-b;
    }
    public double multiply(double a,double b){
        return a*b;
    }
    public double divide(double a,double b){
        return a/b;
    }
    public static void getSum(String a,String b){
        List<Integer>la=new ArrayList<Integer>();
        List<Integer>lb=new ArrayList<Integer>();
        String c="";
        for(int i=a.length()-1;i>=0;--i){
            la.add(a.charAt(i)-'0');
        }
        for(int i=b.length()-1;i>=0;--i){
            lb.add(b.charAt(i)-'0');
        }
        int x1;
        int x2;
        x1=la.get(0)+lb.get(0);
        x2=la.get(1)+lb.get(1);
        int max=a.length()>b.length()?a.length():b.length();
        for(int i=1;i<=max;++i){
            if(x1>=10){
                x2+=1;
                x1/=10;
            }
            c+=x1;
            System.out.println(c);
            x1=x2;
            if(i<=max-2) {
                x2 = la.get(i + 1) + lb.get(i + 1);
            }
        }
        String d="";
        List<Integer>lc=new ArrayList<Integer>();
        for(int i=c.length()-1;i>=0;--i){
            d+=(c.charAt(i)-'0');
        }
        System.out.println(d);
    }
}
