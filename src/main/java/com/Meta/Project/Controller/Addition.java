package com.Meta.Project.Controller;

import java.util.Scanner;

public class Addition {
    public static void Add() {
        Scanner sc = new Scanner(System.in);
            System.out.println("덧셈할 정수 두개를 띄워서 입력 해주세요: ");

            int result = 0;
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            result = (int)num1 + (int)num2;
            System.out.println("덧셈 결과: " + result);
        }
    }

