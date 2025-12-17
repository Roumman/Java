import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) return;
        int n = scanner.nextInt();

        Integer[] array = new Integer[n];
        for (int i = 0; i < n; i++) {
            String input = scanner.next();
            if (input.equals("null")) {
                array[i] = null;
            } else {
                array[i] = Integer.parseInt(input);
            }
        }

        if (!scanner.hasNextInt()) return;
        int m = scanner.nextInt();

        for (int i = 0; i < m; i++) {
            try {
                String command = scanner.next();
                int index = scanner.nextInt();

                int valOrDivisor = 0;
                if (command.equals("SET") || command.equals("DIV")) {
                    valOrDivisor = scanner.nextInt();
                }

                if (index < 0 || index >= n) {
                    throw new ArrayIndexOutOfBoundsException();
                }

                switch (command) {
                    case "GET" -> {
                        System.out.println(array[index]);
                    }
                    case "SET" -> {
                        array[index] = valOrDivisor;
                        System.out.println("OK");
                    }
                    case "DIV" -> {
                        array[index] = array[index] / valOrDivisor;
                        System.out.println(array[index]);
                    }
                }

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBounds");
            } catch (ArithmeticException e) {
                System.out.println("ArithmeticException");
            } catch (NullPointerException e) {
                System.out.println("NullPointerException");
            }
        }
    }
}
