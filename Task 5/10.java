import java.util.Scanner;

class TriangleChecker {
    private double sideA, sideB, sideC;

    public TriangleChecker(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public String isTriangle() {
        if ( sideA < 0  || sideB < 0 || sideC < 0) {
            return "С отрицательными числами ничего не выйдет!";
        }
        if ((sideA + sideB > sideC) && (sideA + sideC > sideB) && (sideB + sideC > sideA)) {
            return "Ура, можно построить треугольник!";
        } else {
            return "Жаль, но из этого треугольник не сделать";
        }
    }
}

public class Task5_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sideA= sc.nextDouble();
        double sideB= sc.nextDouble();
        double sideC= sc.nextDouble();
        sc.close();

        System.out.println(new TriangleChecker(sideA, sideB, sideC).isTriangle());


    }
}
