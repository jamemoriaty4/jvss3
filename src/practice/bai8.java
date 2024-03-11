package practice;

import java.util.Scanner;

public class bai8 {
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
        System.out.println("nhập vi trí cần thay đô");
        int k = Integer.parseInt(sc.nextLine());
        while(k>=n||k<0){
            System.out.println("nhập  lại vi trí cần thay đô");
             k = Integer.parseInt(sc.nextLine());
        }
        System.out.println("nhập giá trị sau khi thay đổi");
        int tem = Integer.parseInt(sc.nextLine());
        arr[k] = tem;
        System.out.print("Mảng sau khi thêm: ");
        for (int i = 0; i < n+1; i++) System.out.print(arr[i] + " ");
    }
}
