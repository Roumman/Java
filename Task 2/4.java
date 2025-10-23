import java.util.Scanner;

public class Task2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 2; i <= n; i=i+2) System.out.print(i + " ");
        sc.close();
    }
}
