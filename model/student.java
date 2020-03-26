package model;

import java.util.ArrayList;
import java.util.Scanner;

public class student {
    private String maSV;
    private String hoDem;
    private String name;
    private String maLop;
    private String gioiTinh;
    private int birth;
    private ArrayList<DanhSachHocPhan> soHocPhan;

    public student() {

    }

    public student(String maSV, String hoDem, String name, String maLop, String gioiTinh, int birth,ArrayList<DanhSachHocPhan> soHocPhan) {
        this.maSV = maSV;
        this.hoDem = hoDem;
        this.name = name;
        this.maLop = maLop;
        this.gioiTinh = gioiTinh;
        this.birth = birth;
        this.soHocPhan = soHocPhan;
    }


    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoDem() {
        return hoDem;
    }

    public void setHoDem(String hoDem) {
        this.hoDem = hoDem;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    public int getBirth() {
        return birth;
    }

    public void setBirth(int birth) {
        this.birth = birth;
    }

    public ArrayList<DanhSachHocPhan> getSoHocPhan() {
        return soHocPhan;
    }

    public void setSoHocPhan(ArrayList<DanhSachHocPhan> soHocPhan) {
        this.soHocPhan = soHocPhan;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
}
