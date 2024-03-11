package practice;

import java.util.Scanner;

public class bai6 {
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
        int sum =0;
        System.out.println("nhập vào giá trị cần tìm");

        int x= Integer.parseInt(sc.nextLine());
        System.out.println("chi so lan luot la: ");
        for (int i = 0; i < n; i++) {
            if(x == arr[i]){
                System.out.printf("%d",i);
                System.out.println();
                sum+=i;
            }
        }
        System.out.println("tổng các chỉ số tìm đc là: "+sum);
    }
}
