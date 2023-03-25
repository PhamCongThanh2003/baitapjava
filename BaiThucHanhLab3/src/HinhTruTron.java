import java.util.Scanner;
public class HinhTruTron {
    public float bankinh;
    public float thetich;
    public float dientichtoanphan;
    public float chieucao;
    public float dientichday;
    public float dientichxungquanh;
    public float Pi = 3.14f;
 
public void Nhapbankinh(){
    Scanner sc = new Scanner(System.in);
    System.out.println("\nNhap vao ban kinh: ");
    bankinh = sc.nextFloat();
}    
public void Nhapchieucao(){
    System.out.println("\nNhap vao chieu cao: ");
    Scanner sc = new Scanner(System.in);
    chieucao = sc.nextFloat();
}
public float thetich(){
    thetich = Pi * 2 * bankinh * chieucao;
    return thetich;
}
public float dientichday(){
    dientichday = Pi * 2 * bankinh;
    return dientichday;
}
public float dientichxungquanh(){
    dientichxungquanh = 2 * Pi * bankinh * chieucao;
    return dientichxungquanh;
}
public float dientichtoanphan(){
    dientichtoanphan = dientichxungquanh + dientichday;
    return dientichtoanphan;
}
public void hienthi(){
    System.out.printf("\nThe tich cua hinh tru tron la: %f ", thetich());
    System.out.printf("\nDien tich xung quanh cua hinh tru tron la: %f ", dientichxungquanh());
    System.out.printf("\nDien tich day cua hinh tru tron la: %f ", dientichday());
    System.out.printf("\nDien tich toan phan cua hinh tru tron la: %f ", dientichtoanphan());
}

public static void main(String[] args) {
HinhTruTron htt1 = new HinhTruTron();
    htt1.Nhapbankinh();
    htt1.Nhapchieucao();
    htt1.hienthi();
}   
}
