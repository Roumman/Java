import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (!scanner.hasNextInt()) return;
        int n = scanner.nextInt();

        List<Number> numbers = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String type = scanner.next();
            if (type.equals("null")) {
                numbers.add(null);
            } else {
                String val = scanner.next();
                switch (type) {
                    case "I" -> numbers.add(Integer.valueOf(val));
                    case "L" -> numbers.add(Long.valueOf(val));
                    case "D" -> numbers.add(Double.valueOf(val));
                }
            }
        }

        double sum = 0.0;
        int nullCount = 0;
        boolean hasSpecial = false;

        for (Number num : numbers) {
            if (num == null) {
                nullCount++;
                continue;
            }

            if (num instanceof Double d) {
                if (d.isNaN() || d.isInfinite()) {
                    hasSpecial = true;
                    continue;
                }
            }

            sum += num.doubleValue();
        }

        System.out.printf("%.2f%n", sum);
        System.out.println(nullCount);
        System.out.println(hasSpecial ? "HAS_SPECIAL" : "NO_SPECIAL");
    }
}
