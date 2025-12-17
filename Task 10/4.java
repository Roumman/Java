import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

class NumberBox<T extends Number> {
    private List<T> listNumbers = new ArrayList<>();

    public void add(T value) {
        listNumbers.add(value);
    }

    public double sum() {
        double result = 0.0;
        for (T item : listNumbers) {
            result += item.doubleValue();
        }
        return result;
    }
}

public class Task10_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        NumberBox<Integer> box = new NumberBox<>();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            box.add(x);
        }

        sc.close();

        System.out.println(box.sum());
    }
}
