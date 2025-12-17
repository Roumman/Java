import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) return;
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int originalValue = scanner.nextInt();
            String targetType = scanner.next();

            Number number = originalValue; 

            switch (targetType) {
                case "byte" -> {
                    byte result = number.byteValue();
                    System.out.println(result);
                    if (result != originalValue) {
                        System.out.println("LOSS");
                    } else {
                        System.out.println("NO_LOSS");
                    }
                }
                case "short" -> {
                    short result = number.shortValue();
                    System.out.println(result);
                    if (result != originalValue) {
                        System.out.println("LOSS");
                    } else {
                        System.out.println("NO_LOSS");
                    }
                }
                case "long" -> {
                    long result = number.longValue();
                    System.out.println(result);
                    System.out.println("NO_LOSS");
                }
            }
        }
    }
}
