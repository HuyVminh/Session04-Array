package BaiTap;

import java.util.Arrays;
import java.util.Scanner;

public class TimMaxTrongMang2Chieu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài dòng trong mảng 2 chiều :");
        int row = sc.nextInt();
        System.out.println("Nhập độ dài cột trong mảng 2 chiều :");
        int column = sc.nextInt();
        int[][] array = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.println("Nhập giá trị thứ [" + i + "][" + j + "] của mảng :");
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println("Mảng 2 chiều : ");
        for (int i = 0; i < row; i++) {
            System.out.print("[ ");
            for (int j = 0; j < column; j++) {
                System.out.print(array[i][j] + "  ");
            }
            System.out.print("]");
            System.out.println();
        }

        int max = array[0][0];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        System.out.println("Giấ trị lớn nhất trong mảng 2 chiều là : " + max);
    }
}
