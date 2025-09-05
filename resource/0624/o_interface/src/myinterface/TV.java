package myinterface;

public class TV implements Device {
    String name;

    public TV(String name) {
        this.name = name;
    }

    @Override
    public void turnOn() {
        System.out.println(name + " 전원을 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println(name + " 전원을 끕니다.");
    }

    public void changeChannel() {
        System.out.println(name + " 채널을 변경합니다.");
    }
}
