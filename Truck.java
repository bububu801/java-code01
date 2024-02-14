package No2;

import java.util.Scanner;

public class Truck extends Vehicle{
    int loader;
    Scanner sc=new Scanner(System.in);
    int payload;
    public void Truck(){
        System.out.println("车轮的个数是： "+"6");
        System.out.println("请输入实载几人：");
        loader=sc.nextInt();
        System.out.print("这是一辆小车，能载6人，实载"+loader+"人");
        if(loader>3){
            System.out.print(",你已经超员了！！！");
        }
        System.out.println(" ");
        System.out.println("请输入装载多少kg");
        payload=sc.nextInt();
        System.out.print("这是一辆卡车，核载5000kg，你已经装载"+payload+"kg");
        if(payload>5000){
            System.out.print(",你超载了！！！");
        }
        System.out.println(" ");
        System.out.println("请执行以下操作：");
        System.out.println("1.start 2.accelerate 3.brake 4.return");
        int x= sc.nextInt();
        switch (x){
            case 1:
                start();
                break;
            case 2:
                System.out.print("请输入你想要达到的速度:");
                x=sc.nextInt();
                accelerate(x);
                break;
            case 3:
                brake();
                break;
            case 4:
                return;
            default:
                break;
        }
    }

    public void start(){
        System.out.println("Turck is started");
    }
    public void accelerate(int speed){
        System.out.println("Turck is accelerating at speed "+speed+"km/h");
    }
    public void brake(){
        System.out.println("Turck is braking");
    }
}
