import java.util.Scanner;
public class Nhanvien {
    public String hovaten;
    public int tuoi;
    public float hesoluong;
    public int lcb = 149000;
    public float luong;


public void NhapthongtinNV(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Ho va ten nhan vien la: ");
    hovaten = sc.nextLine();
    System.out.println("Tuoi cua nhan vien la: ");
    tuoi = sc.nextInt();
}
public void hesoluong(){
    System.out.println("He so luong la: ");   
    Scanner sc = new Scanner(System.in);
    hesoluong = sc.nextFloat();
}
public float luong(){
    luong = hesoluong * lcb;
    return luong; 
}
public void hienthi(){
    System.out.printf("Nhan vien %s - tuoi %d - co muc luong la %f : ", hovaten,tuoi,luong);
}
public static void main (String[] agrs){
    Nhanvien nv1 = new Nhanvien();
    nv1.NhapthongtinNV();
    nv1.hesoluong();
    nv1.hienthi();
   
   
}
}

