package Shape;

import java.util.Scanner;

public class HinhTruTron extends hinhtron{
    public float chieuCao;
    public HinhTruTron(){
        Ten = " Hinh Tru";
    }
    public void nhapChieuCao(){
        nhapBankinh();
        System.out.println("Chieu cao =");
        Scanner sc = new Scanner(System.in);
        chieuCao = sc.nextFloat();
    }
    public void tinhThetich(){
        tinhdientich();
        thetich = dientich * chieuCao;
 
    }
    public static void main(String[] agrs){
        HinhTruTron htt = new HinhTruTron();
        htt.xuatTen();
        htt.nhapChieuCao();
        htt.tinhThetich();
        htt.inthetich();
    }
}
