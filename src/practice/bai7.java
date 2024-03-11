package practice;

import java.util.Scanner;

public class bai7 {
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

        System.out.println("nhập giá trị cần chèn");
        int addNum = Integer.parseInt(sc.nextLine());

        int[] tmp = new int[n+1];


        for (int i = 0; i < n ; i++) {
            tmp[i] = arr[i];
        }
        tmp[n] = addNum;

        arr = tmp;

        System.out.print("Mảng sau khi thêm: ");
        for (int i = 0; i < n+1; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
