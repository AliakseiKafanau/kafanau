import java.util.Arrays;
import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;
        int[] massive = new int[10];

        System.out.println("Заполните массив:");
        for (int i = 0; i < massive.length; i++) {
            massive[i] = input.nextInt();
        }

        System.out.println("Заполненый массив:");
        Arrays.stream(massive).mapToObj(j -> j + " ").forEach(System.out::print);
        System.out.println();

        System.out.println("Числа кратные 3:");
        for (int j : massive) {
            if (j % 3 == 0) {
                number++;
                System.out.println(j + " ");
            }
        }
        System.out.println("Количество элементов кратных 3  =  " + number);
    }
}
