package myinterface;

public class DeviceTest {
    public static void main(String[] args) {

    	Device[] devices = {
            new TV("삼성 TV"),
            new Computer("LG 노트북")
        };

        for (int i = 0; i < devices.length; i++) {
            Device d = devices[i];
            d.turnOn();

            if (d instanceof TV) {
                ((TV) d).changeChannel();
            } else if (d instanceof Computer) {
                ((Computer) d).runProgram();
            }

            d.turnOff();
        }
    }
}

