package example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.compile;

public class demoSDT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("nhập số điện thoại :");

            String Sdt = sc.nextLine();

            String regax = "^(0|\\+84)(\\s|\\.)?((3[2-9])|(5[689])|(7[06-9])|(8[1-689])|(9[0-46-9]))(\\d)(\\s|\\.)?(\\d{3})(\\s|\\.)?(\\d{3})$";
//        Pattern pattern = compile(regax);
//            Matcher matcher = Pattern.compile(regax).matcher(Sdt);
//        boolean checked1 = Pattern.matches(regax,Sdt);
//        boolean checked2 = Sdt.matches(regax);
            boolean checked3 = Pattern.compile(regax).matcher(Sdt).matches();
            System.out.println("kết quả : "+checked3);
            if(checked3) break;

        }
    }
}
