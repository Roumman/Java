import java.util.Scanner;

public class Task4_1 {
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input_text = sc.nextLine();
        sc.close();

        int space_pos = input_text.indexOf(' ');

        String result = input_text.substring(space_pos + 1)+ ' ' + input_text.substring(0,space_pos);
        System.out.println(result);

    }
}
