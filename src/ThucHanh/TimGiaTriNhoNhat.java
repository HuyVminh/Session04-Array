package ThucHanh;

import java.util.Scanner;

public class TimGiaTriNhoNhat {
    public static void main(String[] args) {
        int[] array = {3, 54, 78, 4, 1, 67, 56, 3, 8, 9, 5, 4, 63};
        int index = minValue(array);
        System.out.println("The smallest value in the array is : " + array[index]);
    }

    public static int minValue(int[] array) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }
}
