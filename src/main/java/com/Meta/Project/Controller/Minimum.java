package com.Meta.Project.Controller;

import java.util.Scanner;

public class Minimum {

    public static void min() {

        Scanner sc = new Scanner(System.in);
        System.out.println("최소값을 구하고자하는 정수 두개를 띄워서 입력해주세요: ");

        int result;
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if(num1>num2) {
            System.out.println("최소값은 " +num2+"이당/당");
        } else if(num2>num1) {
            System.out.println("최소값은 " +num1+"이당/당");
        } else{
            System.out.println("두 수가 같은디용?!?!?!?!");
        }

    }
}
