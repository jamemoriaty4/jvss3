package practice;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào số côt của ma trận!");
        int col = Integer.parseInt(sc.nextLine());
        System.out.println("nhập vào số hàng của ma trận!");
        int row = Integer.parseInt(sc.nextLine());

        int[][] arr = new int[row][col];
        System.out.println("nhập mảng");
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.printf("Nhap a[%d][%d] =",i,j );
                arr[i][j] = Integer.parseInt(sc.nextLine());
            }
        }

        System.out.println("mảng sau khi nập l");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("%3d",arr[i][j]);
            }
            System.out.println();
        }

    }
}
