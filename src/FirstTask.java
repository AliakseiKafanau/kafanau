import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double number;

        number = scan.nextDouble();
        if (number >= 7) {
            System.out.println("Привет");
        } else {
            System.out.println("Число меньше 7");
        }

    }
}
