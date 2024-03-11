package practice;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Nhập mảng: ");
        for(int i=0;i<5;i++){
            System.out.printf("a[%d] = ",i);
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("mảng sau khi nhập là :");
        for(int i=0;i<5;i++){
            System.out.printf("a[%d] = %d",i,arr[i]);
            System.out.println();
        }
    }
}
