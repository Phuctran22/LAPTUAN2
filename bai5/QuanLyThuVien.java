package bai5;

import java.util.Scanner;

public class QuanLyThuVien {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n;
    System.out.print("Nhap so luong sinh vien: ");
    n = scanner.nextInt();
    Student[] students = new Student[n];
    
    for (int i = 0; i < n; i++) {
        System.out.println("Nhap thong tin sinh vien " + (i + 1) + ":");
        students[i] = new Student();
        System.out.print("ID: ");
        students[i].setStID(scanner.next());
        System.out.print("Ten: ");
        students[i].setStName(scanner.next());
        System.out.print("Lop: ");
        students[i].setStClass(scanner.next());
    }
    
    System.out.println("\nDanh sach sinh vien:");
    for (Student student : students) {
        System.out.println(student.toString());
    }
    
    scanner.close();
}
}
