package example;

import java.util.Scanner;

public class arraycopy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=0;

        int[] arr = new int[n];

        while (true){
            System.out.println("nhập vào giá trị");
            int x = Integer.parseInt(sc.nextLine());
            n++;

            int[] tmp = new int[n];


            for (int i = 0; i < n - 1; i++) {
                tmp[i] = arr[i];
            }
            tmp[n - 1] = x;

            arr = tmp;

            System.out.print("Mảng sau khi thêm: ");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            if(x==9)break;// giả sử nhập 9 đê rhtoa khỏi ctrinh
        }
        System.err.println("Kết thúc chương trình!");

    }
}
