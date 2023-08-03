package com.Meta.Project.Controller;

import java.util.Scanner;

public class Sum {
    public static void sum() {

        System.out.println("1부터 시작하여 합계를 구하고자 하는 정수를 입력해주세요.");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int result = 0;

        for ( int n = 1; n <= num ; n++) {

        result += n;

    }

	System.out.println("1부터"+" "+ num + "까지의 합계는" +" "+ result + "입니다.");
    }
}

