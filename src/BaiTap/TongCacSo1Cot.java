package BaiTap;

import java.util.Arrays;
import java.util.Scanner;

public class TongCacSo1Cot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] myArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int i = 0; i < myArray.length; i++) {
            System.out.println(Arrays.toString(myArray[i]));
        }
        System.out.println("Chọn cột mà bạn muốn tính tổng :");
        int column = sc.nextInt();
        int total = 0;
        System.out.println("Cột " + column + " gồm các phần tử : ");
        if (column >= 0 && column <= 3) {
            for (int i = 0; i < myArray.length; i++) {
                System.out.print(myArray[i][column] + " ");
                total += myArray[i][column];
            }
        } else {
            System.out.println("Cột không tồn tại !");
        }
        System.out.println();
        System.out.println("Tổng của cột " + column + " trong mảng là : " + total);
    }
}
