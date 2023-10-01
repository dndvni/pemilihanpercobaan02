package jobsheet5;

import java.util.Scanner;

public class PemilihanPercobaan202 {
    public static void main(String[] args) {
        Scanner input02 = new Scanner(System.in);

        System.out.print("Nilai uas     : ");
        float uas = input02.nextFloat();
        System.out.print("Nilai uts     : ");
        float uts = input02.nextFloat();
        System.out.print("Nilai kuis    : ");
        float kuis = input02.nextFloat();
        System.out.print("Nilai tugas   : ");
        float tugas = input02.nextFloat();

        float total = (uas * 0.4F) +(uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.3F);
        String message = total < 65 ? "Remidi" : "Tidak Remidi";

        System.out.println("Nilai akhir = " + total + " sehingga " + message);

        if( total > 80 && total <= 100) {
            System.out.println("Mendapat nilai A dengan kualifikasi Sangat Baik");
        } else if ( total > 73 && total <= 80) {
            System.out.println("Mendapat nilai B+ dengan kualifikasi Lebih dari Baik");
        } else if ( total > 65 && total <= 73) {
            System.out.println("Mendapat nilai B dengan kualifikasi Baik");
        } else if ( total > 60 && total <= 65) {
            System.out.println("Mendapat nilai C+ dengan kualifikasi Lebih dari Cukup");
        } else if ( total > 50 && total <= 60) {
            System.out.println("Mendapat nilai C dengan kualifikasi Cukup");
        } else if ( total > 39 && total <= 50) {
            System.out.println("Mendapat nilai D dengan kualifikasi Kurang");
        } else {
            System.out.println("mendapat nilai E dengan kualifikasi Gagal");
        }
    }
    
  
}