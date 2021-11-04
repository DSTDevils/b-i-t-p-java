/*
* created date:04 Nov 2021
* author: cgm
*/
package com.namnd2008110152.kiemtragiuaki.cau1;

public class NhanVien extends Nguoi{
    private static int HoTen;
    private float heSoLuong;
    public String toString;
    public int salary;
    public NhanVien(String hoTen,float heSoLuong,int salary) {
        super(hoTen, heSoLuong);
        this.heSoLuong = heSoLuong;
        this.salary = salary;       
    }
    protected double getsalary() {
        return (heSoLuong*1500000);
    }
    @Override
    public String toString() {
        return "Họ Tên: " + this.HoTen + "Lương" + this.salary;
    }
}

