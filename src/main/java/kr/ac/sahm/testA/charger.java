package kr.ac.sahm.testA;

public class charger {
    private boolean isOn;

    private int percentage;

    public void turnOn(){
        if(isOn){
            System.out.println("이미 전원이 켜져 있습니다.");
        } else {
            this.isOn = true;
            System.out.println("전원이 켜졌습니다.");
        }
    }

    public void charge(){
        if(isOn){
            if(percentage < 100){
            System.out.println("충전이 시작됩니다.");
            this.percentage += 2;
            System.out.println("현재 충전 잔량은 " +this.percentage + " 입니다.");
            } else {
                System.out.println("이미 충전이 완료 되어 있습니다.");
            }
        } else {
            System.out.println("노트북의 전원이 켜져있지 않습니다. 전원을 먼저 켜 주세요.");
        }
    }

    public void shutDown() {
        if(isOn){
            this.isOn = false;
            System.out.println("전원을 종료합니다.");

        } else {
            System.out.println("전원이 이미 꺼져있습니다. 확인 해주세요.");
        }
    }
}
