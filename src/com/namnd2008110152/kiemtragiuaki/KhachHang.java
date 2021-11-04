/*
* created date:04 Nov 2021
* author: cgm
*/
package com.namnd2008110152.kiemtragiuaki.cau1;

public class KhachHang {
    private static int HoTen;
    private static String tenCongTy;
    private static double triGiaHoaDon;
    public String toString;
    public int salary;
    public KhachHang(String hoTen,float heSoLuong,int salary) {
        super();
        this.tenCongTy = tenCongTy;
        this.triGiaHoaDon = triGiaHoaDon;       
    }
    @Override
    public String toString() {
        return "Họ Tên: " + this.HoTen + "trị Giá Hoá Đơn" + this.triGiaHoaDon;
    }
    protected double gettriGiaHoaDon() {
        return (triGiaHoaDon);
    }
}

