import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

interface Checker<T> {
    boolean test(T value);
}

class EvenChecker implements Checker<Integer> {
    @Override
    public boolean test(Integer value) {
        return value % 2 == 0;
    }
}

public class Task10_5 {

    public static class ListUtils {
        public static <T> List<T> filter(List<T> list, Checker<T> checker) {
            List<T> result = new ArrayList<>();
            for (T elem : list) {
                if (checker.test(elem)) {
                    result.add(elem);
                }
            }
            return result;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        sc.close();
        Checker<Integer> checker = new EvenChecker();

        List<Integer> filtered = ListUtils.filter(list, checker);

        for (int i = 0; i < filtered.size(); i++) {
            System.out.print(filtered.get(i));
            if (i + 1 < filtered.size()) {
                System.out.print(" ");
            }
        }
    }
}
