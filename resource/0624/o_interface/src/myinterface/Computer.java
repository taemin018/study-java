package myinterface;

public class Computer implements Device {
    String name;

    public Computer(String name) {
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

    public void runProgram() {
        System.out.println(name + " 프로그램을 실행합니다.");
    }
}

