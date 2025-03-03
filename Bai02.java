package LAP2;

import java.util.Scanner;

public class Bai02 {
    class HinhChuNhat {
        private double chieuDai;
        private double chieuRong;

        public HinhChuNhat(double chieuDai, double chieuRong) {
            this.chieuDai = chieuDai;
            this.chieuRong = chieuRong;            
        }

        public void setchieuDai(double chieuDai){
            this.chieuDai = chieuDai;
        }

        public void setchieuRong(double chieuRong){
            this.chieuRong = chieuRong;
        }

        public double getchieuDai(){
            return chieuDai;
        }
        
        public double getchieuRong(){
            return chieuRong;
        }

        public double tinhDienTich() {
            return chieuDai * chieuRong;
        }
        
        public double tinhChuVi(){
            return (chieuDai + chieuRong) * 2;
        }

        @Override
        public String toString(){
            return "hinh chu nhat: " + "\n" +
                   "chieu dai: " + chieuDai + "\n" +
                   "chieu rong: " + chieuRong + "\n" +
                   "dien tich: " + tinhDienTich() + "\n" +
                   "chu vi: " + tinhChuVi();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap chieu dai: ");
        double Dai = scanner.nextDouble();
        System.out.print("Nhap chieu rong: ");
        double Rong = scanner.nextDouble();

       
        Bai02 bai = new Bai02();  
        HinhChuNhat hcn = bai.new HinhChuNhat(Dai, Rong);
        

        System.out.println("thong tin hcn: ");
        System.out.println(hcn.toString());
        
        
    }
}