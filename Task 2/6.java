import java.util.Scanner;

public class Task2_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int result = x + 1 + x % 2;
        System.out.println(result);
        sc.close();
    }
}
