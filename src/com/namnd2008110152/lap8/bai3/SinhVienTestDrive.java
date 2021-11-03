/*
* created date:03 Nov 2021
* author: cgm
*/
package com.namnd2008110152.lap8.sinhvien;

public class SinhVienTestDrive {
        public static void main(String[] args) {
            SinhVienIT it = new SinhVienIT("Devil", 0, 0, 0);
            it.getDiem();
            it.getHocLuc();
            SinhVienNA kt = new SinhVienNA("Angel",0,0, 0);
            kt.getDiem();
            kt.getHocLuc();
        }
    }