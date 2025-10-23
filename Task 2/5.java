import java.util.Scanner;

public class Task2_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int p = sc.nextInt();
        String result = v > p ? "Vasya" : v == p ? "Same" : "Petya";
        System.out.println(result);
        sc.close();
    }
}
