import java.util.Scanner;

public class Task1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        int x3 = (int) (x * 1000);
        double cut = x3 / 1000.0;
        System.out.println(cut);
    }
}
