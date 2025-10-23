import java.util.Scanner;

public class Task3_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] jag = new int[n][];
        for (int i = 0; i < jag.length; i++) {
            jag[i] = new int[i + 1];
            for (int j = 0; j < jag[i].length; j++) {
                jag[i][j] = (j + 1) * (i + 1);
            }
        }

        for (var i : jag){
            for (var j : i){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
