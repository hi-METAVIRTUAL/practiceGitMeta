package com.Meta.Project.Controller;

import java.util.Scanner;

public class Maximum {

    public static void max() {

        int input1;
        int input2;
        Scanner sc = new Scanner(System.in);

        System.out.print("비교할 첫번째 수를 입력하세요 : ");
        input1 = sc.nextInt();
        sc.nextLine();
        System.out.print("비교할 두번째 수를 입력하세요 : ");
        input2 = sc.nextInt();

        if (input1<input2) {
            System.out.println("더 큰수는 : " + input2 + " 입니다");
        } else if (input1>input2) {
            System.out.println("더 큰수는 : " + input1 + " 입니다");
        } else {
            System.out.println("두 수는 같습니다.");
        }

    }
}
