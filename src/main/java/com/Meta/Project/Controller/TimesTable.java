package com.Meta.Project.Controller;

import java.util.Scanner;

public class TimesTable {


    public static void nTimes() {

        int i = 0;

        do {

            Scanner sc = new Scanner(System.in);
            System.out.print("구구단 하시겠습니까? (Y/N) : ");
            String plus1 = sc.nextLine();
            if (plus1.equalsIgnoreCase("y")) {
                System.out.println("구구단 시작");
                System.out.print("원하는 구구단 : ");
                int plus2 = sc.nextInt();
                for(i = 1; i <=19; i++ ){
                    System.out.println(plus2 + "x" + i + "=" + (plus2 * i));

                }
                System.out.println(plus2 + "단 완료" );
            } else if (plus1.equalsIgnoreCase("n") || plus1.isEmpty()) {
                break;


            }else {
                System.out.println("잘못 입력 했습니다 Y 또는 N 을 입력 해주세요");
            }




        }while (true) ;


    }


}
