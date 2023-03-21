import java.util.OptionalDouble;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива:  ");
        int size = input.nextInt();
        float[] array = new float[size];
        for (int i = 0; array.length > i; i++) {
            array[i] = (float) Math.random();
            System.out.println("" + array[i]);

        }
        float max = array[0];
        float min = array[0];
        float avg = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i])
                max = array[i];

            if (min > array[i])
                min = array[i];
            avg += array[i] / array.length;


        }
        System.out.println("Maximum:  " + max);
        System.out.println("Minimum:" + min);
        System.out.println("Avg:" + avg);


    }
}


