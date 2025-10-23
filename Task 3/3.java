import java.util.Scanner;

public class Task3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                res[i] = arr[i + 1] - arr[i];
            } else if (i == n - 1) {
                res[i] = arr[i] - arr[i - 1];
            } else {
                res[i] = arr[i + 1] - arr[i - 1];
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(res[i] + " ");
        }

        sc.close();
    }

}
