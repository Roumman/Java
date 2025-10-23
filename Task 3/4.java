import java.util.Scanner;

public class Task3_4 {
    private static void reverse(int[] arr, int left, int right) {
        while (left < right) {
            arr[left] = arr[left] ^ arr[right];
            arr[right] = arr[left] ^ arr[right];
            arr[left] = arr[left] ^ arr[right];
            left++;
            right--;
        }
    }
    public static void shiftLeft(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // если k > n
                                            // 1 2 3 4 5 => 3 4 5 1 2
        reverse(arr, 0, k - 1);   // 2 1 3 4 5
        reverse(arr, k, n - 1);       // 2 1 5 4 3
        reverse(arr, 0, n - 1);  // 3 4 5 1 2
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        shiftLeft(arr, k);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
