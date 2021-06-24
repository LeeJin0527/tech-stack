package Inheritance;
interface PhoneInterface{
    int BUTTONS = 20;
    void sendCall();
    void receiveCall();
}

interface MobilePhoneInterface extends PhoneInterface{
    void sendSMS();
    void receiveSMS();
}

interface MP3Interface{
    public void play();
    public void stop();
}
class PDA{
    public  int calculate ( int x, int y){
        return x + y;
    }
}

class SmartPhone extends PDA implements MobilePhoneInterface, MP3Interface{
    public void sendCall(){System.out.println("전화 걸기 ");}
    public void receiveCall(){System.out.println("전화 받기 ");}
    public void sendSMS(){System.out.println("SMS 보내기  ");}
    public void receiveSMS(){System.out.println("SMS 받기 ");}

    public void play(){
        System.out.println("음악 재생");
    }
    public void stop(){
        System.out.println("재생 중지 ");
    }
    public void schedule(){
        System.out.println("일정 관리 ");
    }
}
public class InterfaceEx {
    public static void main(String[] args){
        SmartPhone p = new SmartPhone();
        p.sendCall();
        p.play();
        System.out.println(p.calculate(3, 5));
        p.schedule();
    }
}
