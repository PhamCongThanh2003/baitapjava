import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class Bai9 {
public static void main ( String[] agrs ){
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhap vao chuoi: ");
    String str = sc.nextLine();

    int lowercaseCount = 0;
    int uppercaseCount = 0;
    int digitCount = 0;

    for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);
        if (Character.isLowerCase(ch)) {
            lowercaseCount++;
        } else if (Character.isUpperCase(ch)) {
            uppercaseCount++;
        } else if (Character.isDigit(ch)) {
            digitCount++;
        }
    }

    System.out.println("so ki tu thuong: " + lowercaseCount);
    System.out.println("so ki tu: " + uppercaseCount);
    System.out.println("so ki tu so: " + digitCount);
}


}    

