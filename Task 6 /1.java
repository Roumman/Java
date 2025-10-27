import java.util.Scanner;

class Shape {
    public double getP() {
        return 0;
    }

    public String getName() {
        return "Shape";
    }

    @Override
    public String toString() {
        return getName() + " " + String.format("%.2f", getP());
    }
}

class Circle extends Shape {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double getP() {
        return 2 * Math.PI * r;
    }

    @Override
    public String getName() {
        return "Circle";
    }
}

class Rectangle extends Shape {
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getP() {
        return 2 * (a + b);
    }

    @Override
    public String getName() {
        return "Rectangle";
    }
}

class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getP() {
        return a + b + c;
    }

    @Override
    public String getName() {
        return "Triangle";
    }
}

public class Task6_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Shape[] shapes = new Shape[n];

        for (int i = 0; i < n; i++) {
            String type = sc.next();

            if (type.equals("Circle")) {
                double r = sc.nextDouble();
                shapes[i] = new Circle(r);
            } else if (type.equals("Rectangle")) {
                double w = sc.nextDouble();
                double h = sc.nextDouble();
                shapes[i] = new Rectangle(w, h);
            } else if (type.equals("Triangle")) {
                double a = sc.nextDouble();
                double b = sc.nextDouble();
                double c = sc.nextDouble();
                shapes[i] = new Triangle(a, b, c);
            }
        }

        String request = sc.next();
        sc.close();

        for (Shape s : shapes) {
            if (s.getName().equals(request)) {
                System.out.println(s);
            }
        }
    }
}
