import java.util.Arrays;
import java.util.Scanner;

public class Task3_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = i <= n/2 - 1 ? i +1 : k;
        }

        int[] arr2 = arr1.clone();
        Arrays.sort(arr2);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.equals(arr1, arr2) ? "YES" : "NO");
        sc.close();
    }
}
