import java.util.Scanner;

class Changer {
    private boolean isFromDigitToWord = true;

    public Changer(boolean isFromDigitToWord) {
        this.isFromDigitToWord = isFromDigitToWord;
    }

    public String change(String str) {
        if (isFromDigitToWord) {
            return changeDigits(str);
        } else {
            return changeWords(str);
        }
    }
    private String changeDigits(String text) {

        text = text.replaceAll("1", "one");
        text = text.replaceAll("2", "two");
        text = text.replaceAll("3", "three");
        text = text.replaceAll("4", "four");
        text = text.replaceAll("5", "five");
        text = text.replaceAll("6", "six");
        text = text.replaceAll("7", "seven");
        text = text.replaceAll("8", "eight");
        text = text.replaceAll("9", "nine");
        text = text.replaceAll("0", "zero");
        return text;
    }
    private String changeWords(String text) {
        text = text.replaceAll("zero", "0");
        text = text.replaceAll("one", "1");
        text = text.replaceAll("two", "2");
        text = text.replaceAll("three", "3");
        text = text.replaceAll("four", "4");
        text = text.replaceAll("five", "5");
        text = text.replaceAll("six", "6");
        text = text.replaceAll("seven", "7");
        text = text.replaceAll("eight", "8");
        text = text.replaceAll("nine", "9");
        return text;
    }
}
public class Task5_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String text = sc.nextLine();
        sc.close();

        Changer c = new Changer(n == 1);
        String changed = c.change(text);
        System.out.println(changed);
    }
}
