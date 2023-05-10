package kr.ac.sahm.testB;

public class Use {

    private Charger charge = new Charger();

    public void charging() {charge.charge();}

    public void turnOn(){charge.turnOn();}

    public void useLaptop() {charge.use();}

    public void shutDown() {charge.turnOff();}

    public void playGame(){charge.game();}

    public void countChar(){charge.countChar();}
}
