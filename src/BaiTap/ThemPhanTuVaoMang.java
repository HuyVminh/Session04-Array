package BaiTap;

import java.util.Arrays;
import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Cho mảng : " + Arrays.toString(array));
        System.out.println("Nhập giá trị muốn thêm vào mảng :");
        int elementToAdd = sc.nextInt();
        System.out.println("Nhập vị trí muốn thêm vào mảng :");
        int indexToAdd = sc.nextInt();
        if (indexToAdd < 0 || indexToAdd > array.length - 1)
            System.out.println("Không thể chèn được phần tử vào mảng");
        else {
            int[] newArray = new int[array.length + 1];
            int j = 0;
            for (int i = 0; i <= indexToAdd; i++) {
                if (i < indexToAdd) {
                    newArray[j] = array[i];
                    j++;
                } else if (i == indexToAdd) {
                    newArray[j] = elementToAdd;
                    j++;
                }
            }
            for (int i = indexToAdd; i < array.length; i++) {
                newArray[j] = array[i];
                j++;
            }
            System.out.println("Mảng sau khi thêm phần tử " + elementToAdd + " là : " + Arrays.toString(newArray));
        }
    }
}
