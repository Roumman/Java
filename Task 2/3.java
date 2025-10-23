import java.util.Scanner;
public class Task2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int result = k / (n + 1);
        System.out.println(result);
        sc.close();
    }
}
