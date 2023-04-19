package Shape;

import java.util.Scanner;

public class hinhtron extends HinhHoc {
    public float banKinh;
    // Constructor
    public hinhtron(){
        Ten = "Hinh Tron";
    }
    public void nhapBankinh(){
     System.out.println("Ban kinh = ");
     Scanner sc = new Scanner(System.in);
    banKinh = sc.nextFloat();
    }
    public void tinhchuvi(){
        chuvi = 2 * PI * banKinh;
    }
    public void tinhdientich(){
        dientich = PI * banKinh * banKinh;
    }
public static void main( String[] agrs){
    hinhtron ht = new hinhtron();
    ht.xuatTen();
    ht.nhapBankinh();
    ht.tinhchuvi();
    ht.tinhdientich();
    ht.inchuvi();
    ht.indientich();
}
}
