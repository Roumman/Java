import java.util.Scanner;

class Student {
    private String name;
    private int room;

    public Student(String name, int room) {
        this.name = name;
        this.room = room;
    }
    public void printInfo() {
        System.out.printf("Имя: %s, номер комнаты: %d%n", this.name, this.room);
    }
}

public class Task5_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Student[]  students = new Student[n];

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int room = sc.nextInt();

            students[i] = new Student(name, room);
        }
        sc.close();

        for (Student student : students) {
            student.printInfo();
        }
    }
}
