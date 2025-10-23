import java.util.Scanner;

public class Task1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if ( (n & 1) == 0 ) {
            System.out.println("EVEN");
        } else {
            System.out.println("ODD");
        }
    }
}
