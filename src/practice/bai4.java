package practice;

import java.util.Scanner;

public class bai4 {
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
        int max=-999999,min =99999999;
        for (int i = 0; i < n; i++) {
            if(arr[i]>max){
                max =arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.printf("Số lớn nhấ trong mảng là : %d",max);
        System.out.println();
        System.out.printf("Số bé nhấ trong mảng là : %d",min);
    }
}
