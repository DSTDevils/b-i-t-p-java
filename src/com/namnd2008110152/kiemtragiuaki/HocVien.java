/*
* created date:04 Nov 2021
* author: cgm
*/
package com.namnd2008110152.kiemtragiuaki.cau1;

public class HocVien extends Nguoi {
    private static int HoTen ;
    private float diemmonhoc1, diemmonhoc2;
    private static  int soluongHV;
    public String toString;
    public HocVien(String hoTen,float diemmonhoc1, float diemmonhoc2, int soluongHV) {
        super(hoTen, diemmonhoc1, diemmonhoc2, soluongHV);
        this.diemmonhoc1 = diemmonhoc1;
        this.diemmonhoc2 = diemmonhoc2;
        this.soluongHV = soluongHV;
        
    }
    int diemtrungbinh;
    protected double getdiemtrungbinh(){
        return (diemmonhoc1+diemmonhoc2)/2;
    }
    @Override
    public String toString() {
        return "Họ Tên: " + this.HoTen + "điểm trung bình" + this.diemtrungbinh;
    }
}

