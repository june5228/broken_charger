package kr.ac.sahm.testB;

import java.util.Random;
import java.util.Scanner;

public class Charger {

    private boolean isOn;

    private int percentage = 30;
    Scanner sc = new Scanner(System.in);
    Random random = new Random();
    public void charge(){
        System.out.println("충전을 시작합니다.");
        if(percentage < 100){
            percentage += 3;
            System.out.println("현재 잔량 : " + percentage);
        } else {
            System.out.println("충전이 완료 되어있는 상태 입니다.");
        }


    }

    public void turnOn(){
        if(percentage < 5){
            System.out.println("배터리가 부족하므로 사용이 불가능 합니다. 충전을 먼저 진행 해 주세요.");
        } else {
            if(isOn){
                System.out.println("이미 전원이 켜져 있습니다.");
            } else {
                this.isOn = true;
                System.out.println("전원이 켜졌습니다.");
            }
        }
    }

    public void use(){
        if(isOn){
            if(percentage > 0){
                if(percentage < 5){
                    System.out.println("사용하기 위한 최소 배터리 용량이 충족되지 않았습니다. 충전을 먼저 해 주세요. (최소 5)");
                }else {
                    System.out.println("사용을 시작합니다.");
                    this.percentage -= 5;
                    System.out.println("잔여 충전 잔량은 " + this.percentage + " 입니다.");
                }
            } else{
                System.out.println("방전 되었습니다 충전을 먼저 해 주세요");
            }
        } else {
            System.out.println("노트북의 전원이 꺼져있습니다. 전원을 먼저 켜주세요");
        }
    }
    public void game(){
        if(isOn){
            System.out.print("게임을 플레이 하시겠습니까? (Y/N)");
            char answer = sc.next().charAt(0);
            if(answer == 'y'|| answer == 'Y'){
                System.out.println("게임을 시작합니다..");
                int useage = random.nextInt(20) + 10;
                percentage -= useage;
                System.out.println("게임을 하여 " + useage + "만큼의 배터리를 소모했습니다.");
                System.out.println();
                System.out.println("배터리 잔량 : " + percentage);
                if(useage > percentage){
                    System.out.println("게임으로 인해 방전되었습니다.");
                    turnOff();
                }
            }
        }

    }
    public void countChar(){
        System.out.print("글자수를 셀 문자열을 입력 해 주세요 : ");
        String str = sc.nextLine();
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            count += 1;
        }
        System.out.println("입력한 문자열의 글자 수는 " + count + " 입니다.");
        percentage -= 2;
        System.out.println("배터리 잔량 : " + percentage);
    }

    public void turnOff(){
        if(isOn){
            this.isOn = false;
            System.out.println("전원을 종료합니다.");

        } else {
            System.out.println("전원이 이미 꺼져있습니다. 확인 해주세요.");
        }
    }
}
