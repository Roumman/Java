import java.util.Scanner;

public class Task4_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        sc.close();

        text = text.replaceAll("0", "zero");
        text = text.replaceAll("1", "one");
        text = text.replaceAll("2", "two");
        text = text.replaceAll("3", "three");
        text = text.replaceAll("4", "four");
        text = text.replaceAll("5", "five");
        text = text.replaceAll("6", "six");
        text = text.replaceAll("7", "seven");
        text = text.replaceAll("8", "eight");
        text = text.replaceAll("9", "nine");

        System.out.println(text);
    }
}
