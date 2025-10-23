import java.util.Scanner;

class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

class Vector {
    private Point a;
    private Point b;

    public Vector(Point a, Point b) {
        this.a = a;
        this.b = b;
    }

    public double getLength() {
        int dx = b.getX() - a.getX();
        int dy = b.getY() - a.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }
}

public class Task5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        sc.close();

        Point p1 = new Point(x1, y1);
        Point p2 = new Point(x2, y2);

        Vector vector = new Vector(p1, p2);

        System.out.printf("%.3f", vector.getLength());
    }
}
