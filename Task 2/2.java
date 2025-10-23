import java.util.Scanner;

public class Task2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int div = n;

        for (int i = 2; i*i <= n; i++) {
            if  (n % i == 0) {
                div = i;
                break;
            }
        }
        System.out.println(div);
        sc.close();
    }
}
