package kr.ac.sahm.testB;

import java.util.Scanner;

public class Labtop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Use use = new Use();
        do {
            System.out.println("============ 고장난 야매 충전기 ===============");
            System.out.println("1. 충전하기");
            System.out.println("2. 전원 켜기");
            System.out.println("3. 노트북 사용하기");
            System.out.println("4. 게임하기");
            System.out.println("5. 글자 수 세기");
            System.out.println("6. 전원 꺼버리기");
            System.out.println("9. 프로그램 종료");
            System.out.println();
            System.out.print("메뉴 선택 : ");

            int input = sc.nextInt();

            switch (input){
                case 1: use.charging(); break;
                case 2: use.turnOn(); break;
                case 3: use.useLaptop(); break;
                case 4: use.playGame(); break;
                case 5: use.countChar(); break;
                case 6: use.shutDown(); break;
                case 9: return;
                default:
                    System.out.println("잘못된 입력을 하셨습니다. 다시 입력 해 주세요.");
            }
        }while(true);
    }
}

