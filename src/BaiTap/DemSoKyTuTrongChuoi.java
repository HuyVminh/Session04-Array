package BaiTap;

import java.util.Scanner;

public class DemSoKyTuTrongChuoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi :");
        String str = sc.nextLine();
        System.out.println(str);
        System.out.println("Nhập ký tự cần đếm trong chuỗi :");
        char ch = sc.nextLine().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        System.out.println("Số lần xuất hiện của ký tự [" + ch + "] trong chuỗi [" + str + "] là : " + count + " lần.");
    }
}
