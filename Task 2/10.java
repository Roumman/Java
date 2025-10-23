import java.util.Scanner;

public class Task2_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;
        for (int i = 1; i <= n; i++) {
            int x = sc.nextInt();
            result += x;
        }
        System.out.println(result);
        sc.close();
    }
}
