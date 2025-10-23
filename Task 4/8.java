import java.util.Scanner;

public class Task4_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        sc.close();

        StringBuilder result = new StringBuilder(text);

        for (int i = text.length() - 1;  i >= 0; i--) {
            if ((i + 1) % 3 == 0) result.deleteCharAt(i);
        }

        System.out.println(result);

    }
}
