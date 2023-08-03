package com.Meta.Project.Controller;

import java.util.Scanner;

import java.util.Scanner;


public class Subtract {

    public static void sub() {

        do {

            Scanner sc = new Scanner(System.in);
            System.out.print("계산 하시겠습니까? (Y/N) : ");
            String plus1 = sc.nextLine();
            if (plus1.equalsIgnoreCase("Y")) {
                System.out.println("뺄셈을 시작 합니다.");
                System.out.print("첫번째 숫자 입력하세요 : ");
                int plus2 = sc.nextInt();
                System.out.print("두번째 숫자 입력하세요 : ");
                int plus3 = sc.nextInt();
                System.out.println(plus2 - plus3);
            } else if (plus1.equalsIgnoreCase("N") || plus1.isEmpty()) {
                break;

            }else {
                System.out.println("잘못 입력 했습니다 Y 또는 N 을 입력 해주세요");
            }




        }while (true);



    }

}


