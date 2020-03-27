package model;

public class hocphan {
    private String maHocPhan;
    private String tenHocPhan;
    private int tinChi;
    private double diemEnd;

    public hocphan() {

    }

    public hocphan(String maHocPhan, String tenHocPhan, int tinChi, double diemEnd) {
        this.maHocPhan = maHocPhan;
        this.tenHocPhan = tenHocPhan;
        this.tinChi = tinChi;
        this.diemEnd = diemEnd;
    }

    public String getMaHocPhan() {
        return maHocPhan;
    }

    public void setMaHocPhan(String maHocPhan) {
        this.maHocPhan = maHocPhan;
    }

    public String getTenHocPhan() {
        return tenHocPhan;
    }

    public void setTenHocPhan(String tenHocPhan) {
        this.tenHocPhan = tenHocPhan;
    }

    public int getTinChi() {
        return tinChi;
    }

    public void setTinChi(int tinChi) {
        this.tinChi = tinChi;
    }

    public double getDiemEnd() {
        return diemEnd;
    }

    public void setDiemEnd(double diemEnd) {
        this.diemEnd = diemEnd;
    }
}
