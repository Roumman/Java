import java.util.Scanner;

class Rose {
    private int petals;
    private static int maxPetals = 0;

    public Rose(int petals){
        this.petals = petals;
        if(maxPetals < petals){
            maxPetals = petals;
        }
    }

    public static  int getMaxPetals(){
        return maxPetals;
    }

}
public class Task5_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            int petals = sc.nextInt();
            new Rose(petals);
        }
        sc.close();

        System.out.println(Rose.getMaxPetals());
    }
}
