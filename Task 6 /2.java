import java.util.Scanner;


class Device {
    private static int sumPower;
    private String name;
    private int power;

    public Device(String name, int power) {
        this.name = name;
        this.power = power;
        sumPower += power;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public static int getSumPower() {
        return sumPower;
    }

    @Override
    public String toString() {
        return name + " Power " + power;
    }
}
class Laptop extends Device {
    public Laptop(int power) {
        super("Laptop", power);
    }
}
class Smartphone extends Device {
    public Smartphone(int power) {
        super("Smartphone", power);
    }
}
class Refrigerator extends Device {
    public Refrigerator(int power) {
        super( "Refrigerator", power);
    }
}


public class Task6_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Device[] devices = new Device[n];

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            int power = sc.nextInt();
            if (type.equals("Laptop")) {
                devices[i] = new Laptop(power);
            } else if (type.equals("Smartphone")) {
                devices[i] = new Smartphone(power);
            } else if (type.equals("Refrigerator")) {
                devices[i] = new Refrigerator(power);
            }
        }
        sc.close();
        for (Device device : devices) {
            System.out.println(device);
        }
        System.out.println(Device.getSumPower());
    }
}
