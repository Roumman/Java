import java.util.Scanner;

public class Task2_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int result = 0;
        do  {
            result += x % 10;
            x /= 10;
        } while (x != 0);
        System.out.println(result);
        sc.close();
    }
}
