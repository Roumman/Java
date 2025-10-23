import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        sc.close();

        String regex = "[aeiouyAEIOUY]";
        Pattern pattern = Pattern.compile(regex);

        String[] phrases = text.split(";");

        for (String phrase : phrases) {
            phrase = phrase.trim();
            if (phrase.isEmpty()) continue;

            StringBuilder abbr = new StringBuilder();
            String[] words = phrase.split("\\W");
            for (String word : words) {
                if (word.isEmpty()) continue;
                Matcher matcher = pattern.matcher(word);
                int endIndex;
                if (matcher.find()) {
                    endIndex = matcher.start() + 1; // гласная включается
                } else {
                    endIndex = word.length(); // если гласных нет — всё слово
                }

                abbr.append(word.toUpperCase(), 0, 1).append(word.toLowerCase(),1,endIndex);
            }
            System.out.println(abbr);
        }
    }
}
