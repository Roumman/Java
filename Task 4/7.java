import java.util.Scanner;

public class Task4_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        sc.close();

        int first = text.indexOf('h');
        int last = text.lastIndexOf('h');

        text = text.substring(0,first) + text.substring(last + 1);
        System.out.println(text);
    }
}
