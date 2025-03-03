package LAP2;
import java.util.Scanner;

public class Bai01 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        //cau a
        System.out.print("Nhap phan tu mang: ");
        int n = Scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("nhap " +n+" so nguyen");
        for (int i= 0; i<n;i++) {
            System.out.println( " nhap phan tu thu " + (i+1)+ ": ");
            arr [i] = Scanner.nextInt();
        }
        System.out.println("mang vua nhap: " );
        for (int i =0; i<n;i++){
            System.out.println(arr[i] + " ");
        }
        //cau b
        System.out.println("cac phan tu cua mang:");
        for (int i = 0; i < n; i++) {
        System.out.println("arr[" + i + "] = " + arr[i]);
        }

        //cau c
        System.out.println("nhap so nguyen x can tim: ");
        int x = Scanner.nextInt();

        Boolean found = false;
        for (int i = 0; i< n; i++){
            if (arr[i] == x) {
                System.out.println("So "+x+ " tim duoc tai vi tri "+ i);
                found = true;
            }
        }
        if (!found) {
            System.out.println("khong tim thay "+ x + " trong mang");
        }
        //cau d
        int max = arr[0];
        for (int i =1;i<n;i++){
            if (arr[i]> max) {
                max = arr[i];
            }
        }
        System.out.println("so lon nhat trong mang: " + max);

        //cau e
        int min = arr[0];
        for (int i =1;i<n;i++){
            if (arr[i]< min) {
                min = arr[i];
            }
        }
        System.out.println("so nho nhat trong mang: " + min);

        //cau f
        int maxIndex = 0;
            for (int i = 1; i<n;i++){
                maxIndex =i;
            }
            System.out.println("vi tri co phan tu lon nhat trong mang: " + maxIndex);

            //cau g
            for (int i= 0; i<n -1; i++){
                for (int j = 0; j < n - i - 1;j++){
                    if (arr[j]>arr[j+1]) {
                        int temp = arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }
            System.out.println("sap xep mang tang dan: " );
            for (int i =0; i<n;i++) {
                System.out.print(arr[i]+ " ");
            }
    }
}