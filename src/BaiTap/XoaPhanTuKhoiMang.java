package BaiTap;

import java.util.Arrays;
import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {1, 3, 5, 7, 9, 2, 4, 6, 8};
        // In ra mảng ban đầu
        System.out.println("Mảng ban đầu là : " + Arrays.toString(array));

        // Nhập giá trị phần tử cần xóa
        System.out.println("Nhập giá trị phần tử cần xóa :");
        int elementToDelete = sc.nextInt();

        // Kiểm tra xem phần tử đó có tồn tại hay không
        boolean check = false;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (elementToDelete == array[i]) {
                check = true;
                index = i;
                break;
            }
        }
        if (check) {
            int[] newArray = new int[array.length - 1];
            int j = 0;
            for (int i = 0; i < array.length; i++) {
                if (index != i) {
                    newArray[j] = array[i];
                    j++;
                }
            }
            System.out.println("Mảng mới sau khi xóa phần tử " + elementToDelete + " là : " + Arrays.toString(newArray));
        } else {
            System.out.println("Không tìm thấy phần tử " + elementToDelete + " trong mảng");
        }
    }
}
