package com.namnd2008110152.lap8.sinhvien;

public class SinhVienIT extends SinhVien{
    private double diemJava;
    private double diemHtml;
    private double diemCss;
    protected SinhVienIT(String name,double diemJava,double diemCss,double diemHtml){
        super(name,"IT");
        this.diemCss=diemCss;
        this.diemHtml=diemHtml;
        this.diemJava=diemJava;
    }
    @Override
    protected double getDiem() {
        return (2*diemJava+diemCss+diemHtml)/4;
    }
       
}