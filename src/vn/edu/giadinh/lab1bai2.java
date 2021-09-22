package vn.edu.giadinh;
import java.util.Scanner;
public class lab1bai2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chieu dai: ");
        double dai = scanner.nextDouble();
        System.out.print("Nhap chieu rong: ");
        double rong = scanner.nextDouble();
        double chuvi = (dai + rong)*2;
        double dientich = dai * rong;
        var canhNho =Math.min(dai,rong);
        System.out.printf("\nChu vi hinh chu nhat la:%.1f ", chuvi); 
        System.out.printf("\nDien tich hinh chu nhat la:%.1f ", dientich);
        System.out.printf("\nCanh nho nhat hinh chu nhat la:%.1f ", canhNho);
    }
    
}
