package example;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nh vào số pần tử trong mảng!");
        int n = Integer.parseInt(sc.nextLine());
        int[] array1D = new int[n];
        for (int i=0;i<array1D.length;i++){
            System.out.printf("a[%d] = ",i);
            array1D[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println(Arrays.toString(array1D));

        System.out.println("nhap so sinh vien");
        int k = Integer.parseInt(sc .nextLine());
        String[][] sv = new String[k][2];

        for (int i = 0; i < k; i++) {
            System.out.println("Nhập thông tin sinh viên thứ " + (i + 1));
            System.out.print("Mã sinh viên: ");
            sv[i][0] = sc.nextLine();
            System.out.print("Tên sinh viên: ");
           sv[i][1] = sc.nextLine();
        }

        for (int i = 0; i < k; i++) {
            System.out.println("Mã sinh viên: " + sv[i][0]);
            System.out.println("Tên sinh viên: " + sv[i][1]);
            System.out.println();
        }
    }
}
