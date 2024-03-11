package practice;

import java.util.Scanner;

public class bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào số phần tử cuar mảng: ");
        int n = Integer.parseInt(sc.nextLine());
        int[] arr = new int[n];
        System.out.println("Nhập mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = Integer.parseInt(sc.nextLine());
        }

        int[] tmp = new int[n-1];
        System.out.println("nhập vi trí cần xoá");
        int k = Integer.parseInt(sc.nextLine());
        while(k>=n||k<0){
            System.out.println("nhập  lại vi trí cần xoá");
            k = Integer.parseInt(sc.nextLine());
        }
        for (int i = 0, j = 0; i < n; i++) {
            if (i == k) {
                continue;
            }
            tmp[j++] = arr[i];
        }

        arr = tmp;

        System.out.println("Mảng sau khi xóa:");
        for (int i = 0; i < n - 1; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
