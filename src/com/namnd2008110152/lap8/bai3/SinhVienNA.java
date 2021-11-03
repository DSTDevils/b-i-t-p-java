package com.namnd2008110152.lap8.sinhvien;

public class SinhVienNA extends SinhVien {
    private double speaking;
    private double writing;
    private double listening;
    public SinhVienNA(String hoTen, double speaking, double writing, double listening) {
        super(hoTen, hoTen);
        this.speaking = speaking;
        this.writing = writing;
        this.listening = listening;
    }
    protected double getDiem() {
        return (2*speaking+writing+listening)/4;
    }
}
