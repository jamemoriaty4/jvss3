package example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.compile;

public class demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder stringBuilder = new StringBuilder("học ");
        stringBuilder.append(" Java");
        System.out.println(stringBuilder);
        String regex ="^.+@.+$";
        System.out.println("hãy nhập vào email");
        String email = sc.nextLine();
        Pattern pattern = compile(regex);
        Matcher matcher = pattern.matcher(email);
        boolean check = matcher.matches();
        System.out.println(check);
    }

}
