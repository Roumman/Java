import java.util.Scanner;

public class Task1_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int d1 = x / 1000;        
        int d2 = (x / 100) % 10;  
        int d3 = (x / 10) % 10;   
        int d4 = x % 10;  
        if (d1 == d4 && d2 == d3) {
            System.out.println("1");
        } else {
            System.out.println("-1");
        }
    }
}
