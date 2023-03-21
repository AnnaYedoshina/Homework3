import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int n = 0;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("ВВЕДИТЕ размер массива: ");
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
            } else System.out.println("Введено не верное число. Повторите ввод:  ");

        } while (n > 10 || n < 5);

        int[] array1 = new int[n];
        int evenNums = 0;
        for (int i = 0; i < n; i++) {
            array1[i] = (int) (Math.random() * (n + 1));
            if (array1[i] % 2 == 0) {
                evenNums++;
            }
        }

        System.out.println(Arrays.toString(array1));
        int[] mas2 = new int[evenNums];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (array1[i] % 2 == 0) {
                mas2[index] = array1[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(mas2));


    }


}
