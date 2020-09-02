package cycles;

import java.util.Arrays;
import java.util.Random;

public class ArrayMain6 {
    public static void main(String[] args) {
        int[] arr1 = new int[10];
        Random rand = new Random();
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = rand.nextInt(10);
        }
        System.out.println("Initial array:");
        for (int j : arr1) {
            System.out.print(j + " ");
        }
        System.out.println();
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] += 10;
        }
        System.out.println("new array:");
        for (int elem : arr1) {
            System.out.print(elem + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(arr1));
    }
}
