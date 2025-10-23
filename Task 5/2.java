import java.util.Scanner;

class Soda {
    private String flavor;

    public Soda(String flavor) {
        if (isValidFlavor(flavor)) {
            this.flavor = flavor;
        } else {
            this.flavor = null;
        }
    }
    private boolean isValidFlavor(String flavor) {
        return flavor.matches("^[a-zA-Zа-яА-ЯёЁ]+$");
    }
    public void showMyDrink () {
        if (flavor != null) {
            System.out.println("Газировка со вкусом \"" + flavor + "\"");
        }  else {
            System.out.println("Обычная газировка");
        }
    }
}
public class Task5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String flavor = sc.nextLine().trim();
        sc.close();

        Soda myDrink = new Soda(flavor);
        myDrink.showMyDrink();
    }
}
