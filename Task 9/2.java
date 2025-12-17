import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) return;
        int n = scanner.nextInt();
        int d = scanner.nextInt();

        int bestBase = 2;
        int maxCount = -1;
        String bestResult = "";
        char target = (char) ('0' + d);

        for (int radix = 2; radix <= 16; radix++) {
            String numStr = Integer.toString(n, radix);
            
            int currentCount = 0;
            for (int i = 0; i < numStr.length(); i++) {
                if (numStr.charAt(i) == target) {
                    currentCount++;
                }
            }

            if (currentCount > maxCount) {
                maxCount = currentCount;
                bestBase = radix;
                bestResult = numStr;
            }
        }

        System.out.println(bestBase);
        System.out.println(bestResult);
    }
}
