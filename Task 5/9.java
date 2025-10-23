import java.util.Scanner;

class Calculator {
    private int current = 0;

    public Calculator(int current) {
        this.current = current;
    }

    public void plus(int number) {
        this.current = this.current + number;
    }

    public void minus(int number) {
        this.current = this.current - number;
    }

    public int getCurrent() {
        return current;
    }
}
public class Task5_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int current = sc.nextInt();
        Calculator c = new Calculator(current);
        int n = sc.nextInt();
        String[] inputStrings = new String[n];

        for (int i = 0; i < n; i++) {
            inputStrings[i] = sc.next();
        }
        sc.close();

        for (String inputString : inputStrings) {
            boolean isPlus = inputString.charAt(0) == '+';
            int number = Integer.parseInt(inputString.substring(1));
            if (isPlus) {
                c.plus(number);
            } else {
                c.minus(number);
            }
            System.out.println(c.getCurrent());
        }

    }
}
