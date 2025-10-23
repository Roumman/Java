import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        sc.close();

        String regex =
                "(?<!\\d)" +                     // слева не цифра
                        "(?:\\+7|8|7)" +                 // префикс
                        "(?<number>" +
                        "\\d{10}" +                  // слитно
                        "|" +
                        "[\\s-(]*\\d{3}[\\s-)]*\\d{3}[\\s-]*\\d{2}[\\s-]*\\d{2}" + // 3-3-2-2
                        "|" +
                        "[\\s-]*\\(\\d{3}\\)[\\s-]*\\d{7}" +                    // (код) и 7 цифр
                        ")" +
                        "(?!\\d)";  // справа не цифра

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            String digits = matcher.group("number").replaceAll("\\D", "");
            if (digits.length() != 10) continue;
            String code = digits.substring(0, 3);
            int codeNum = Integer.parseInt(code);
            if (codeNum < 900 || codeNum > 999) continue;
            String part1 = digits.substring(3, 6);
            String part2 = digits.substring(6, 8);
            String part3 = digits.substring(8, 10);

            String result = "+7 (" + code + ") " + part1 + "-" + part2 + "-" + part3;
            System.out.println(result);
        }
    }

}
