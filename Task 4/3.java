import java.util.Scanner;
import java.util.regex.*;

public class Task4_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        sc.close();

        String regex = "\\b[a-zA-Z]{4,}\\b"; // слова, состоящих более чем из трех букв и не содержащих цифр
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        long count = matcher.results().count();

        System.out.println(count);

    }
}
