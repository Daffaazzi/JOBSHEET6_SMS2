package LatihanPraktikum;

public class Dosen {
    String kode;
    String nama;
    boolean jenisKelamin; // true = L, false = P
    int usia;

    public Dosen(String kode, String nama, boolean jk, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jk;
        this.usia = usia;
    }

    void tampil() {
        String jk = jenisKelamin ? "Laki-laki" : "Perempuan";
        System.out.println(kode + " | " + nama + " | " + jk + " | " + usia);
    }
}