/*
* created date:04 Nov 2021
* author: cgm
*/
package com.namnd2008110152.kiemtragiuaki.cau1;

public class TrungTamTestDrive {
    public static void main(String[] args) {
        Nguoi nguoi = new Nguoi("Devil", 0, 0, 0);
        nguoi.getDiaChi();
        nguoi.getHoTen();
        NhanVien nhanvien = new NhanVien("Angel",0,0);
        nhanvien.getDiaChi();
        nhanvien.getsalary();
        KhachHang khachhang = new KhachHang(null, 0, 0);
        khachhang.gettriGiaHoaDon();
        HocVien hocvien = new HocVien(null, 0, 0, 0);
        hocvien.getdiemtrungbinh();
    }
}

