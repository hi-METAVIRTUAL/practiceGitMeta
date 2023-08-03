package com.Meta.Project.Controller;

import java.util.Scanner;

public class Modulo {
    public static void mod() {

        System.out.println("나누고 싶은 수를 정수로 입력해주세요.");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();

        System.out.println("몇으로 나눌까요? (정수로 입력해주세요.)");
        int num2 = sc.nextInt();

        int result = 0;

        if (num2 != 0) {
            int quotient = (num1 / num2);
            int remainer = (num1 % num2);
            System.out.println(num1 + "을(를)" + " " + + num2 + "(으)로 나눈 나머지는" + " " + remainer + " " + "입니다.");
        } else {
            System.out.println("0으로 나누기는 불가능합니다.");
        }
    }
}