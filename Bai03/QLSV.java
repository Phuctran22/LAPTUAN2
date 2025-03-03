package Bai03;

import java.util.Scanner;

public class QLSV {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tạo sv1 - thông tin của bạn
        sinhVien sv1 = new sinhVien(12345, "Nguyen Van A", 8.5f, 7.8f);

        // Tạo sv2 - thông tin bạn thân
        sinhVien sv2 = new sinhVien(12346, "Tran Thi B", 7.9f, 8.2f);

        // Tạo sv3 - sử dụng constructor mặc định
        sinhVien sv3 = new sinhVien();

        // Nhập thông tin cho sv3 từ bàn phím
        System.out.println("Nhap thong tin sinh vien thu 3:");
        System.out.print("Ma SV: ");
        int Mssv = scanner.nextInt();
        scanner.nextLine(); // Xóa buffer
        System.out.print("Ho ten: ");
        String hoTen = scanner.nextLine();
        System.out.print("Diem LT: ");
        float diemLT = scanner.nextFloat();
        System.out.print("Diem TH: ");
        float diemTH = scanner.nextFloat();

        // Gán thông tin cho sv3 qua setter
        sv3.setMssv(Mssv);
        sv3.sethoTen(hoTen);
        sv3.setdiemLT(diemLT);
        sv3.setdiemTH(diemTH);

        // In bảng danh sách sinh viên
        System.out.println("\nDANH SACH SINH VIEN");
        System.out.println("                                                      ");
        System.out.printf("%-10s %-20s %-10s %-10s %-10s\n", 
            "MSSV", "Ho Ten", "Diem LT", "Diem TH", "Diem TB");
        System.out.println("                                                      ");
        System.out.println(sv1);
        System.out.println(sv2);
        System.out.println(sv3);
        System.out.println("                                                      ");

        
    }
}
