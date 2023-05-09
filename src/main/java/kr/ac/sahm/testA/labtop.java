package kr.ac.sahm.testA;

import java.util.Scanner;

public class labtop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        charger charger = new charger();
        do {
            System.out.println("============ 고장난 야매 충전기 ===============");
            System.out.println("1. 전원 켜보기");
            System.out.println("2. 충전 해보기");
            System.out.println("3. 전원 꺼버리기");
            System.out.println("9. 프로그램 종료");
            System.out.println();
            System.out.print("메뉴 선택 : ");

            int input = sc.nextInt();

            switch (input){
                case 1: charger.turnOn(); break;
                case 2: charger.charge(); break;
                case 3: charger.shutDown(); break;
                case 9: return;
            }
        }while(true);
    }

}

