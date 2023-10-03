package BaiTap;

import java.util.Arrays;
import java.util.Scanner;

public class TimPhanTuLonThu2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài của mảng :");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập giá trị thứ " + (i + 1) + " trong mảng : ");
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        int max1 = arr[0], max2 = arr[0];
        for (int i = 1; i < size; i++) {
            if (max1 < arr[i]) {
                max2 = max1;
                max1 = arr[i];
            } else if (max2 < arr[i] && arr[i] != max1) {
                max2 = arr[i];
            }
        }
        System.out.println("Số lớn thứ 2 trong mảng là " + max2);

    }
}
