import java.lang.runtime.SwitchBootstraps;
import java.util.Scanner;
public class Bai4 {
public static void main(String[] agrs){
Scanner sc = new Scanner(System.in);
System.out.println("Nhap vao 1 so duong tu 1-12 the hien cho cac thang tuong ung voi cac so do: ");
int thang = sc.nextInt();
switch(thang){
    case 1:
             System.out.println("Thang 1 ne: ");
    break;
    case 2:
             System.out.println("Thang 2 ne: ");
    break;
    case 3:
            System.out.println("Thang 3 ne: ");
    break;
    case 4:
            System.out.println("Thang 4 ne: ");
    break;
    case 5:
            System.out.println("Thang 5 ne: ");
    break;
    case 6:
            System.out.println("Thang 6 ne: ");
    break;
    case 7:
            System.out.println("Thang 7 ne: ");
    break;
    case 8:
            System.out.println("Thang 8 ne: ");
    break;
    case 9:
            System.out.println("Thang 9 ne: ");
    break;
    case 10:
            System.out.println("Thang 10 ne: ");
    break;
    case 11:
            System.out.println("Thang 11 ne: ");
    break;
    case 12:
            System.out.println("Thang 12 ne: ");
    break;   
    default:
    System.out.println("Khong phai la thang trong nam roi:");
}
}
}