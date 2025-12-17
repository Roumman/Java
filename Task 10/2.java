import java.util.Scanner;

public class Task10_2 {
    public static <T> T firstOrNull(T[] array) {
        if (array == null || array.length == 0) {
            return null;
        }
        return array[0];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        if (n < 0) return;

        String[] arr = new String[n];

        if (n > 0) {

            for (int i = 0; i < n; i++) {
                arr[i] = sc.next();
            }
        }
        sc.close();

        String result = firstOrNull(arr);

        System.out.println(result);

    }
}
