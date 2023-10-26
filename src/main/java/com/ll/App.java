package com.ll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    void run(){
        int n = 0;

        List<Quato> quatos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("== 명언 앱 ==");
        while(true) {


            System.out.print("명령) ");
            String cmd = scanner.nextLine();

            if(cmd.equals("종료")){
                break;
            }

            else if(cmd.equals("등록")){

                System.out.print("명언 : ");
                String content = scanner.nextLine();
                System.out.print("작가 : ");
                String authorName = scanner.nextLine();
                n++;
                int id = n;
                Quato quato = new Quato(id, content, authorName);
                quatos.add(quato);


                System.out.println(n + "번 명언이 등록되었습니다.");

                }
                else if(cmd.equals("목록")){
                    for(int i = quatos.size() - 1; i>=0; i--){
                        Quato quato = quatos.get(i);
                        System.out.printf("%d/ %s / %s\n", quato.id, quato.content, quato.authorName);
                    }
            }
        }

            }
}




