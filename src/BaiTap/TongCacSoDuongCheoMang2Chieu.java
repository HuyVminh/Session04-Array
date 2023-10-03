package BaiTap;

import java.util.Arrays;
import java.util.Scanner;

public class TongCacSoDuongCheoMang2Chieu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Khai báo cột trong ma trận vuông :");
        num = sc.nextInt();
        int[][] array = new int[num][num];

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.println("Nhập giá trị thứ [" + i + "][" + j + "]: ");
                array[i][j] = sc.nextInt();
            }
        }

        System.out.println("Ma trận hình vuông :");
        for (int i = 0; i < num; i++) {
            System.out.println(Arrays.toString(array[i]));
        }

        int total = 0;
        System.out.println("Các giá trị trên đường chéo là : ");
        for (int i = 0; i < num; i++) {
            System.out.print(array[i][i] + " ");
            total += array[i][i];
        }
        System.out.println();
        System.out.println("Tổng của các số trên đường chéo trong ma trận vuông là : " + total);
    }
}
