package StreamAPI.FirstTask;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        printArray(sortArray(filterArray(initialArray())));
    }

    static int[] initialArray() {
        return new int[]{1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4};
    }

    static int[] filterArray(int[] arr) {
        int size = arr.length;
        int[] arrTmp = new int[size];
        int iter = 0;
        for (int a : arr) {
            if (a <= 0) {
                continue;
            } else if (a % 2 == 0) {
                arrTmp[iter] = a;
                iter++;
            }
        }
        return Arrays.copyOf(arrTmp, iter);
    }

    static int[] sortArray(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }

    static void printArray(int[] arr) {
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
