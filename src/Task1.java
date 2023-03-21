import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = scanner.nextInt();
        int[] filtered = Arrays.stream(arr).filter(i -> i != num).toArray();
        System.out.println(Arrays.toString(filtered));
        if (num != arr.length) {
            System.out.println("Нет такого числа в массиве");
        }
    }
}





