/*
* created date:04 Nov 2021
* author: cgm
*/
package com.namnd2008110152.kiemtragiuaki.cau1;
import java.util.Scanner;
public class Nguoi {

    private String hoTen, DiaChi;
    private int tuoi;
    Scanner scanner = new Scanner(System.in);
     
    public Nguoi(String hoTen2, float diemmonhoc1, float diemmonhoc2, int soluongHV) {
        super();
    }
 
    public Nguoi(String hoTen, String DiaChi, int tuoi) {
        super();
        this.hoTen = hoTen;
        this.DiaChi= DiaChi;
        this.tuoi = tuoi;

    }
 
 
    public Nguoi(String hoTen2, float heSoLuong) {
    }

    public String getHoTen() {
        return hoTen;
    }
 
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
 
    public String getDiaChi() {
        return DiaChi;
    }
 
    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    } 
    public int getTuoi() {
        return tuoi;
    }
 
    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }   
    public void nhap() {

        System.out.print("Nhập họ tên nhân viên: ");
        hoTen = scanner.nextLine();
        System.out.print("Nhập địa chỉ: ");
        DiaChi = scanner.nextLine();
        System.out.print("Nhập tuổi: ");
        tuoi = scanner.nextInt();
    }
     
    @Override
    public String toString() {
        return "Mã nhân viên: " + this.DiaChi + ", họ tên nhân viên: " + this.hoTen + ", số điện thoại: " + this.tuoi;
    }
}
