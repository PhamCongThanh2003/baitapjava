import java.util.Scanner;

public class Slide40 {
    public static void main(String[] args) throws Exception {
        int day;
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhap tu 1 -> 7 tuong ung tu thu 2 -> chu nhat ");

    
        do {
            System.out.print("\nNhap ngay : ");
            day = sc.nextInt();
            switch(day) {
                case 1:
                System.out.print("Hom nay la thu 2 ");
                break;
                case 2:
                System.out.print("Hom nay la thu 3 ");
                break;
                case 3:
                System.out.print("Hom nay la thu 4 ");
                break;
                case 4:
                System.out.print("Hom nay la thu 5 ");
                break;
                case 5:
                System.out.print("Hom nay la thu 6 ");
                break;
                case 6:
                System.out.print("Hom nay la thu 7 ");
                break;
                case 7:
                System.out.print("Hom nay la thu chu nhat ");
                break;
                default:
                System.out.print("Khong phai ngay trong tuan  !");
                break;
            }
            
        }while(day <= 7); 
        sc.close();
    
    }
}