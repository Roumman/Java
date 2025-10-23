import java.util.Scanner;

public class Task3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]  arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 1; i < n; i++) {
            boolean compare;
            compare = arr[i - 1] < arr[i];
            System.out.print(compare ? "YES" : "NO");
            System.out.print(i != n - 1 ? " " : "");
        }
        System.out.println( n == 1 ? "" : "!");
        sc.close();
    }
}
