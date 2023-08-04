package com.Meta.Project.Controller;

import java.util.Scanner;

public class Multiplication {
    public static void multiply() {

        System.out.println("곱셈을 시작 합니다.");
        Scanner sc1 = new Scanner(System.in);

            int result1 = 0;
            System.out.print("첫번째 수를 입력 : ");
            int input1 = sc1.nextInt();
            sc1.nextLine();
            System.out.print("두번째 수를 입력 : ");
            int input2 = sc1.nextInt();

            result1 = input1 * input2;
            System.out.println("곱셈 결과 : " + result1);


    }
}
