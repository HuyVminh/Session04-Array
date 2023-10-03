package BaiTap;

import java.util.Arrays;
import java.util.Scanner;

public class TimMinTrongMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập độ dài của mảng :");
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập giá trị thứ " + i + " là : ");
            array[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(array));

        int min = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Giá trị nhỏ nhất trong mảng là " + min);
    }
}
