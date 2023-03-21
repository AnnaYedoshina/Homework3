import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 5, 2, 6, 4, 3};
        System.out.print(Arrays.toString(array));
        System.out.println(" ");

        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;

            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    isSorted = false;

                }

            }
            System.out.print(Arrays.toString(array));
            System.out.println(" ");
        }
    }
}
