import java.util.Scanner;
 
public class bai2 {
    public static void main (String[] agrs){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Nhap vao so nguyen lon hon 0: ");
    int x = scanner.nextInt();
    scanner.close();
    if( x % 2 == 0 ){
        System.out.println("So vua nhap la so chan");
    }else{
        System.out.println("So vua nhap la so le");
    }
    }
}
 
   