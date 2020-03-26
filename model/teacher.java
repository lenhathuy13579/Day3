package model;

public class teacher {
    private String maGV;
    private String name;
    private String maLop;
    private String gioiTinh;
    private int birth;

    public teacher() {

    }

    public teacher(String maGV, String name, String maLop, String gioiTinh, int birth) {
        this.maGV = maGV;
        this.name = name;
        this.maLop = maLop;
        this.gioiTinh = gioiTinh;
        this.birth = birth;
    }

    public String getMaGV() {
        return maGV;
    }

    public void setMaGV(String maGV) {
        this.maGV = maGV;
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

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getBirth() {
        return birth;
    }

    public void setBirth(int birth) {
        this.birth = birth;
    }
}
