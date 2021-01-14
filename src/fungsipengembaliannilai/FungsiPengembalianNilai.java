/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fungsipengembaliannilai;

import java.util.Scanner;


public class FungsiPengembalianNilai {

    
    public static void main(String[] args) {
        // input data
        Scanner masukan = new Scanner(System.in);
        // Deklarasi variabel
        int a, b, c;
        //input data dari user dan inisialisasi variabel
        System.out.println("Program Menjumlahkan 2 Nilai");
        System.out.print("Masukan Nilai a : ");
        a = masukan.nextInt();
        System.out.print("Masukan Nilai b : ");
        b = masukan.nextInt();
        System.out.print("Masukan Nilai c : ");
        c = masukan.nextInt();
        System.out.println();
        //Proses output
        System.out.println("jumlah a + b : " + (jumlah(a, b)));
        System.out.println("jumlah b + c : " + (jumlah(b, c)));
        System.out.println("jumlah a + c : " + (jumlah(a, c)));

    }

    // konstruktor
    private static int jumlah(int a, int b) {
        int hasil = a + b;
        return hasil;
    }
}
