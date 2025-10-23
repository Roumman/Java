import java.util.Scanner;
import java.util.regex.*;

public class Task4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        sc.close();

        String regex = "\\b[A-Za-z]+\\b"; // только латинские буквы в слове
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        long count = matcher.results().count();

        System.out.println(count);
    }
}
