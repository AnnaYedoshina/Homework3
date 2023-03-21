public class Task5 {
    public static void main(String[] args) {
        int[] test = {4, 7, -4, 2, 1, 7};

        for (int i = 0; i < test.length; i++) {
            System.out.print(test[i] + " ");
        }
        System.out.println(" ");
        for (int i = 0; i < test.length; i++) {
            if (test[i] % 2 != 0)
                test[i] = 0;
            System.out.print(test[i] + " ");

        }
    }
}
