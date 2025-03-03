package Bai03;

public class sinhVien {
    private int Mssv;
    private String hoTen;
    private float diemLT;
    private float diemTH;

    public sinhVien() {
        this.Mssv = 0;
        this.hoTen = " ";
        this.diemLT = 0f;
        this.diemTH = 0f;
    }

    public sinhVien(int Mssv, String hoTen, float diemLT, float diemTH) {
        this.Mssv = Mssv;
        this.hoTen = hoTen;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
    }

    public int getMssv() {
        return Mssv;
    }

    public void setMssv(int Mssv) {
        this.Mssv = Mssv;
    }

    public String gethoTen() {
        return hoTen;
    }

    public void sethoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public float getdiemLT() {
        return diemLT;
    }

    public void setdiemLT(float diemLT) {
        this.diemLT = diemLT;
    }

    public float getdiemTH() {
        return diemTH;
    }

    public void setdiemTH(float diemTH) {
        this.diemTH = diemTH;
    }

    public float tinhdiemTB() {
        return (diemLT + diemTH) / 2;
    }

    @Override
    public String toString() {
        return String.format("%-10d %-20s %-10.2f %-10.2f %-10.2f", 
            Mssv, hoTen, diemLT, diemTH, tinhdiemTB());
}
}
