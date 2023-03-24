import java.rmi.StubNotFoundException;
import java.util.Scanner;

public class HinhTron {
   
    public float bk;
    public float pi = 3.14f;
    public float chuvi;
    public float dientich;



public void Nhapbankinh(){
    Scanner sc = new Scanner(System.in);
    System.out.println("\nNhap vao ban kinh : ");
    bk = sc.nextFloat();
    sc.close();
}
public float chuvi(){
    chuvi = (bk * 2) * pi; 
    return chuvi;
}
public float dientich(){
    dientich = bk * bk * pi;
    return dientich;
}
public void hienthi(){
    System.out.printf("\nChu vi hinh tron la : %f " , chuvi());
    System.out.printf("\nDien tich hinh tron la : %f" , dientich());
}
public static void main(String[] agrs){
    HinhTron ht1 = new HinhTron();
    ht1.Nhapbankinh ();
    ht1.hienthi();
    
}
}
    

