interface Device {
    void turnOn();
    void turnOff();
    void showStatus();
}


class SmartLight implements Device {
    private boolean ison;
    private int brightness;

    SmartLight(int brightness) {
        this.brightness = brightness;
        this.ison = false;
    }

    public void turnOn() {
        ison = true;
        System.out.println("Light is turned on");
    }

    public void turnOff() {
        ison = false;
        System.out.println("Light is turned off");
    }

    public void showStatus() {
        if (ison) {
            System.out.println("Light is turned on with brightness: " + brightness);
        } else {
            System.out.println("Light is turned off");
        }
    }
}


class SmartFan implements Device {
    private boolean ison;
    private int speed;

    SmartFan(int speed) {
        this.speed = speed;
        this.ison = false;
    }

    public void turnOn() {
        ison = true;
        System.out.println("Fan is turned on");
    }

    public void turnOff() {
        ison = false;
        System.out.println("Fan is turned off");
    }

    public void showStatus() {
        if (ison) {
            System.out.println("Fan is turned on with speed: " + speed);
        } else {
            System.out.println("Fan is turned off");
        }
    }
}


public class Main4 {
    public static void main(String[] args) {
        Device d1 = new SmartLight(80);
        Device d2 = new SmartFan(3);

        d1.turnOn();
        d1.showStatus();

        d2.turnOn();
        d2.showStatus();

        d1.turnOff();
        d2.turnOff();
    }
}