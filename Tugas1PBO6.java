/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihanpbo4;

/**
 * @author LENOVO
 */
// Nama class ini harus sama dengan nama file (LatihanPBO4.java)
public class Tugas1PBO6 {
    // Atribut
    public double alas;
    public double tinggi;
    public double sisi;

    // Constructor tanpa parameter
    public Tugas1PBO6() {
        this.alas = 1;
        this.tinggi = 1;
        this.sisi = 1;
    }

    // Constructor dengan parameter
    public Tugas1PBO6(double alasBaru, double tinggiBaru, double sisiBaru) {
        this.alas = alasBaru;
        this.tinggi = tinggiBaru;
        this.sisi = sisiBaru;
    }

    public double getLuas() {
        return 0.5 * alas * tinggi;
    }

    public double getKeliling() {
        return 3 * sisi; 
    }

    public void setAlas(double alasBaru) { this.alas = alasBaru; }
    public void setTinggi(double tinggiBaru) { this.tinggi = tinggiBaru; }
    public void setSisi(double sisiBaru) { this.sisi = sisiBaru; }

    // MAIN METHOD
    public static void main(String[] args) {
        // Objek 1 (Nama objek menggunakan tipe LatihanPBO4)
        Tugas1PBO6 segitiga1 = new Tugas1PBO6(1, 1, 1);
        Tugas1PBO6 segitiga2 = new Tugas1PBO6(30, 10, 90);
        Tugas1PBO6 segitiga3 = new Tugas1PBO6(20, 30, 60);

        printData(1, segitiga1);
        printData(2, segitiga2);
        printData(3, segitiga3);
    }

    public static void printData(int no, Tugas1PBO6 s) {
        System.out.println("Segitiga " + no + ":");
        System.out.println("- Luas    : " + s.getLuas());
        System.out.println("- Keliling: " + s.getKeliling());
        System.out.println("-------------------------");
    }
}