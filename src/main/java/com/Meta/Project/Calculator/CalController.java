package com.Meta.Project.Calculator;

import java.util.Scanner;

public class CalController {

    Scanner sc = new Scanner(System.in);
    public void addition() {
        System.out.println("덧셈할 정수 두개를 띄워서 입력 해주세요: ");

        int result = 0;
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        result = (int)num1 + (int)num2;
        System.out.println("덧셈 결과: " + result);
    }

    public void subtraction() {





    }

    public void division() {
        System.out.println("곱셈할 정수 두개를 띄워서 입력 해주세요: ");

        int result = 0;
        int num = sc.nextInt();
        int num2= sc.nextInt();


    }

    public void multiplication() {
    }

    public void modulo() {

    }

    public void addTillN() {
    }

    public void timesTable() {
    }

    public void average() {
    }

    public void minimum() {
    }

    public void maximum() {
    }

}

