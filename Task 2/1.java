import java.util.Scanner;

public class Task2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        double length = Math.sqrt(x * x + y * y);

        System.out.println(length);
        sc.close();
    }
}
