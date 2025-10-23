import java.util.Scanner;

public class Task3_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int result = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    result += matrix[i][j];
                } else if (i + j == n - 1) {
                    result += matrix[i][j];
                }
            }
        }
        System.out.println(result);
        sc.close();
    }
}
