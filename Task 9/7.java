import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            scanner.nextLine();
            while (n-- > 0) {
                try {
                    Calculator.calculate(scanner.nextLine());
                } catch (Exception e) {
                    System.out.println("ERROR: " + e.getClass().getSimpleName() + ": " + e.getMessage());
                }
            }
        }
    }
}

class Calculator {
    public static void calculate(String s) {
        s = s.trim();
        int idx = -1;
        for (int i = 1; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!Character.isLetterOrDigit(c) && !Character.isWhitespace(c) && c != '.') {
                idx = i; break;
            }
        }

        if (idx == -1) throw new IllegalArgumentException("Invalid expression format");

        String op = s.substring(idx, idx + 1);
        String p1 = s.substring(0, idx).trim();
        String p2 = s.substring(idx + 1).trim();

        if (p1.isEmpty() || p2.isEmpty()) throw new IllegalArgumentException("Invalid expression format");
        if (!"+-*/".contains(op)) throw new IllegalArgumentException("Unknown operation: " + op);

        double n1 = Double.parseDouble(p1);
        double n2 = Double.parseDouble(p2);

        if (op.equals("/") && n2 == 0) throw new ArithmeticException("Division by zero");

        System.out.printf("%.2f%n", switch (op) {
            case "+" -> n1 + n2;
            case "-" -> n1 - n2;
            case "*" -> n1 * n2;
            default -> n1 / n2;
        });
    }
}
