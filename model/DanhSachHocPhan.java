package model;

import java.util.ArrayList;

public class DanhSachHocPhan {
    private String maSv;
    private int soHP;
    private ArrayList<hocphan> hocPhan;

    public DanhSachHocPhan() {
    }

    public DanhSachHocPhan(String maSv, int soHP, ArrayList<hocphan> hocPhan) {
        this.maSv = maSv;
        this.soHP = soHP;
        this.hocPhan = hocPhan;
    }

    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    public int getSoHP() {
        return soHP;
    }

    public void setSoHP(int soHP) {
        this.soHP = soHP;
    }

    public ArrayList<hocphan> getHocPhan() {
        return hocPhan;
    }

    public void setHocPhan(ArrayList<hocphan> hocPhan) {
        this.hocPhan = hocPhan;
    }
}
