import java.util.Scanner;

public class Task0 {
    public static void main(String[] args) {
        int[] test;
        test = new int[100];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = scanner.nextInt();
        if (a <= test.length - 1) {
            System.out.println("Число входит в массив");
        } else if (a > test.length - 1) {
            System.out.println("Число не входит в массив");
        }

    }
}