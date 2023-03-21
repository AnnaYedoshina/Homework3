public class Task3 {
    public static void main(String[] args) {
        double sumNums1 = 0;
        double sumNums2 = 0;
        int[] nums1 = {1, 2, 3, 4, 5};
        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i] + "");
            sumNums1 += (double) nums1[i] / nums1.length;
        }
        System.out.println("");

        int[] nums2 = {6, 7, 8, 9, 10};
        for (int j = 0; j < nums2.length; j++) {
            System.out.print(nums2[j]);
            sumNums2 += (double) nums2[j] / nums1.length;

        }
        System.out.println("");
        if (sumNums1 == sumNums2) System.out.println("Средние арифметические значения двух массивов равны");
        else {
            if (sumNums1 > sumNums2)
                System.out.println("Среднее арифметическое значение первого массива больше и равно: " + sumNums1);
            else System.out.println("Среднее арифметическое значение второго массива больше и равно: " + sumNums2);


        }
    }
}