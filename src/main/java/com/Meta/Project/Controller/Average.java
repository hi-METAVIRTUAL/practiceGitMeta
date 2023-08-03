package com.Meta.Project.Controller;


import java.util.Scanner;

public class Average {

    public static void avg() {
        Scanner sc = new Scanner(System.in);
        System.out.println("계산할 1보다 큰 수를 입력하세요 : ");
        int num = sc.nextInt();

        int sum=0;
        float avg=0;

        if(num>1){
            for(int i=1; i<=num; i++)
                sum+=i;
            avg=sum/num;
            System.out.println("1부터 "+num+"까지의 평균은 "+avg+"입니다.");
        }
        else{
            System.out.println("1보다 큰 수를 입력해주세요.");
        }

    }
}
