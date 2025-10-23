import java.util.Scanner;

class Pupil {
    private String name;
    private int[][] marks;

    public Pupil(String name, int[][] marks) {
        this.name = name;
        this.marks = marks;
    }

    public double getMark(int quarter) {
        int[] qMarks = marks[quarter - 1];
        int sum = 0;
        for (int mark : qMarks) {
            sum += mark;
        }
        return (double) sum / qMarks.length;
    }

    public double getMark() {
        double total = 0;
        for (int i = 1; i <= 4; i++) {
            total += getMark(i);
        }
        return  total / 4.0;
    }

    @Override
    public String toString() {
        return String.format("Total for %s: %.1f", name, getMark());
    }
}
public class Task5_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine().trim();
        int[][] marks = new int[4][];

        for (int i = 0; i < 4; i++) {
            String[] row = sc.nextLine().split("\\s+");
            marks[i] = new int[row.length];
            for (int j = 0; j < row.length; j++) {
                marks[i][j] = Integer.parseInt(row[j]);
            }
        }
        sc.close();

        Pupil pupil = new Pupil(name, marks);

        System.out.printf("I: %.1f%n", pupil.getMark(1));
        System.out.printf("II: %.1f%n", pupil.getMark(2));
        System.out.printf("III: %.1f%n", pupil.getMark(3));
        System.out.printf("IV: %.1f%n", pupil.getMark(4));
        System.out.println(pupil);

    }

}
