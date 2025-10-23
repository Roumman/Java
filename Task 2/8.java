import java.util.Scanner;

public class Task2_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int result;
        if ((a >= b && a <= c) || (a <= b && a >= c)) {
            result = a;
        } else if ((b >= a && b <= c) || (b <= a && b >= c)) {
            result = b;
        } else {
            result = c;
        }
        System.out.println(result);
        sc.close();
    }
}
