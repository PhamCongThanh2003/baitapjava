import java.util.ArrayList;
import java.util.Scanner;
public class Slide22 {
public static void main(String[] agrs) {
    ArrayList<Integer> arrayListIntegers = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    int number;
    System.out.println("Nhap vao phan tu cua ArrayList: ");
    int n = sc.nextInt()
    for( int i = 0; i < n ; i++){
        System.out.println("Nhap vao phan tu thu "+ i + ": ");
        number = sc.nextInt();
        arrayListIntegers.add(number);
    }
    int max = arrayListIntegers.get(0);
    for ( int i = 1; i < arrayListIntegers.size(); i++){
        if (arrayListIntegers.get(i).compareTo(max) > 0){
            max = arrayListIntegers.get(i);
        }
    }
    System.out.println("Phan tu lon nhat trong arrListInteger = "+ max);
}
}

