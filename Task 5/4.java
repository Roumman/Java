import java.util.Scanner;

class Kitten{
    private String name;
    private String color;
    private String owner;

    public Kitten(String name, String color, String owner){
        this.name = name;
        this.color = color;
        this.owner = owner;
    }

    public Kitten(String name, String color){
        this(name,color,"неизвестно");
    }

    public Kitten(String color){
        this("Рыжик",color);
    }

    public void printInfo() {
        System.out.println(color + " " + name + ". Хозяин - " + owner + ".");
    }


}
public class Task5_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine().trim();
        sc.close();

        String[] parts = text.split("\\s+");
        Kitten kitten;

        switch (parts.length) {
            case 1:
                kitten = new Kitten(parts[0]);
                break;
            case 2:
                kitten = new Kitten(parts[0],parts[1]);
                break;
            default:
                kitten = new Kitten(parts[0],parts[1],parts[2]);
        }

        kitten.printInfo();
    }
}
