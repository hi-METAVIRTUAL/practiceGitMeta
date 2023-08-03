package com.Meta.Project.Calculator;

import com.Meta.Project.Controller.Addition;
import com.Meta.Project.Controller.Average;
import com.Meta.Project.Controller.Subtract;
import com.Meta.Project.Controller.Modulo;
import com.Meta.Project.Controller.TimesTable;
import com.Meta.Project.Controller.Maximum;
import com.Meta.Project.Controller.Multiplication;
import com.Meta.Project.Controller.Minimum;
import com.Meta.Project.Controller.Sum;
import com.Meta.Project.Controller.Division;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("**메타 계산기**");
            System.out.println("1. 덧셈 (+)");
            System.out.println("2. 뺄셈 (-)");
            System.out.println("3. 나눗셈 (÷)");
            System.out.println("4. 곱셈 (x)");
            System.out.println("5. modulo (%)");
            System.out.println("6. n까지의 합계 구하기");
            System.out.println("7. 구구단");
            System.out.println("8. n까지의 평균 구하기");
            System.out.println("9. 최대 값 구하기");
            System.out.println("10. 최소 값 구하기");
            System.out.println("0. 프로그램 종료");
            System.out.println("계산기 번호를 입력하세용 : ");
            int no = sc.nextInt();


            switch (no) {
                case 1: Addition.Add(); break;
                case 2: Subtract.sub(); break;
                case 3: Division.divide(); break;
                case 4: Multiplication.multiply(); break;
                case 5: Modulo.mod(); break;
                case 6: Sum.sum(); break;
                case 7: TimesTable.nTimes(); break;
                case 8: Average.avg(); break;
                case 9: Maximum.max(); break;
                case 10: Minimum.min(); break;
                case 0: System.out.println("프로그램을 종료합니당ㅜㅜ\nbye."); return;
                default: System.out.println("잘못된 계산기 번호입니다만?"); break;
            }
        } while (true);
    }
}