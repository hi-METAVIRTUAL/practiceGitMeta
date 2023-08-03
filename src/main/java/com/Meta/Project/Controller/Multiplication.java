package com.Meta.Project.Controller;

import java.util.Scanner;

public class Multiplication {
    public static void multiply() {

        Scanner sc = new Scanner(System.in);

        System.out.println("곱셈할 정수 두개를 띄워서 입력 해주세요: ");

        int result1 = 0;
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();

        result1 = input1 * input2;
        System.out.println("곱셈 결과: " + result1);

    }
}
