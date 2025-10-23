import java.util.Scanner;

class Nikola {
    private String name;
    private int age;

    public Nikola(String name, int age) {
        if (!"Николай".equals(name)) {
            this.name = "я не " + name + ", а Николай";
        } else {
            this.name = name;
        }
        this.age = age;
    }

    public void printInfo() {
        System.out.printf("Имя: %1$s, возраст: %2$d%n", this.name, this.age);
    }
}

public class Task5_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine().trim();
        int age = sc.nextInt();
        sc.close();

        Nikola nikola = new Nikola(name, age);
        nikola.printInfo();
    }
}
