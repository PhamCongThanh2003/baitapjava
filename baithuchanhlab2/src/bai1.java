import java.util.Scanner;
public class bai1 {
       public static void main(String[] agrs){
       Scanner sc = new Scanner(System.in);
       System.out.println("Nhap vao so thu nhat ne: ");
       int a = sc.nextInt();
       System.out.println("Nhap vao so thu hai ne: ");
       int b = sc.nextInt();
     
       System.out.println("Tong hai so la: " + (a + b));
       System.out.println("Hieu hai so la: " + (a - b));
       System.out.println("Thuong hai so la: " + (a / b));
       System.out.println("Tich hai so la: " + (a * b));
       System.out.println("So thu nhat chia du cho so thu hai: " + (a % b));
    
    if ( a - b > 0){
        System.out.println("So thu nhat lon hon so thu hai: ");
    }else if(a - b == 0){
        System.out.println("so thu nhat bang so thu hai: ");
    }else{
        System.out.println("So thu nhat be hon so thu hai: ");
    }

    }

}
