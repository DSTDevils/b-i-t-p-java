package vn.edu.giadinh;
 import java.util.Scanner;
public class Lab1Bai3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap canh khoi lap phuong: ");
        double canh = scanner.nextDouble();

        double thetich = canh*canh*canh;
        System.out.printf("\nChu vi hinh chu nhat la:%.1f ", thetich); 

    }
    
}
    

