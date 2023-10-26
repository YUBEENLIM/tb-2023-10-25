package com.ll;

import java.util.Scanner;

public class App {
    void run(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("== 명언 앱 ==");
        while(true) {
            System.out.print("명령) ");
            String cmd = scanner.nextLine();

            if(cmd.equals("종료")){
                break;
            }

            System.out.print("명언 : ");
            String a = scanner.nextLine();
            System.out.print("작가 : ");
            String b = scanner.nextLine();
            System.out.println("1번 명언이 등록되었습니다.");
        }
    }
}
