package BaiTap;

import java.util.Arrays;
import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập giá trị phần tử cho mảng 1 :");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Giá trị thứ " + (i + 1) + " là : ");
            arr1[i] = sc.nextInt();
        }

        System.out.println("Nhập giá trị phần tử cho mảng 2 :");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("Giá trị thứ " + (i + 1) + " là : ");
            arr2[i] = sc.nextInt();
        }

        System.out.println("Mảng 1 là : " + Arrays.toString(arr1));
        System.out.println("Mảng 2 là : " + Arrays.toString(arr2));

        int[] arr3 = new int[arr1.length + arr2.length];
        int j = 0;
        for (int k : arr1) {
            arr3[j] = k;
            j++;
        }
        for (int k : arr2) {
            arr3[j] = k;
            j++;
        }
        System.out.println("Mảng mới sau khi gộp 2 mảng lại là : " + Arrays.toString(arr3));
    }
}
