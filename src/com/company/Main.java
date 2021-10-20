package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        addition();
        substraction();
        multiplication();
        division();
    }

    public static  void addition(){
        Scanner console = new Scanner(System.in);
        System.out.print("Enter addition number 1  ");
        int num1 = console.nextInt();
        System.out.print("Enter addition number 2  ");
        int num2 = console.nextInt();
        System.out.println( num1+" + "+num2+" = "+ (num1 + num2));
        console.close();
    }
    public  static  void substraction(){
        Scanner console = new Scanner(System.in);
        System.out.print("Enter subtraction number 1  ");
        int num1 = console.nextInt();
        System.out.print("Enter subtraction number 2  ");
        int num2 = console.nextInt();
        System.out.println( num1+" - "+num2+" = "+ (num1 - num2));
        console.close();
    }
    public static  void multiplication(){
        Scanner console = new Scanner(System.in);
        System.out.print("Enter multiplication number 1  ");
        int num1 = console.nextInt();
        System.out.print("Enter multiplication number 2  ");
        int num2 = console.nextInt();;
        System.out.println( num1+" * "+num2+" = "+ (num1 * num2));
        console.close();
    }
    public  static  void division(){
        Scanner console = new Scanner(System.in);
        System.out.print("Enter division number 1  ");
        int num1 = console.nextInt();
        System.out.print("Enter division number 2  ");
        int num2 = console.nextInt();
        System.out.println( num1+" / "+num2+" = "+ (num1 / num2));
        console.close();
    }
}
