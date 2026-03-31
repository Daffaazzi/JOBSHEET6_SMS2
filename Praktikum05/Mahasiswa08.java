package Praktikum05;

public class Mahasiswa08 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    static Mahasiswa08[] listMhs;
    static int idx;

    // Konstruktor default
    Mahasiswa08() {

    }
    
    Mahasiswa08(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.ipk = ipk;
        this.kelas = kelas;
    }

    void tampilInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("IPK: " + ipk);
        System.out.println("Kelas: " + kelas);
    }

   
}