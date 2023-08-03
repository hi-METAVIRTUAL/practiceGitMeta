package com.Meta.Project.Controller;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Division {

    public static void divide() {
        Scanner sc = new Scanner(System.in);

        System.out.println("나누고자하는 숫자를 띄워서 입력해주세요: ");

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        double result;

        result = (double)num1/num2;

        System.out.println("나눗셈 결과: " + result);


    }
}
