package LatihanPraktikum;

import java.util.Scanner;

public class DosenMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DatanyaDosen list = new DatanyaDosen();

        int pilih;

        do {
            System.out.println("\n=== MENU DOSEN ===");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampil Data");
            System.out.println("3. Sorting ASC (Termuda -> Tertua)");
            System.out.println("4. Sorting DSC (Tertua -> Termuda)");
            System.out.println("5. Insertion Sort ASC");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();

            switch (pilih) {
                case 1:
                    list.inputData();
                    break;
                case 2:
                    list.tampil();
                    break;
                case 3:
                    list.sortingASC();
                    System.out.println("Data berhasil diurutkan ASC!");
                    break;
                case 4:
                    list.sortingDSC();
                    System.out.println("Data berhasil diurutkan DSC!");
                    break;
                case 5:
                    list.insertionSort();
                    System.out.println("Data berhasil diurutkan (Insertion)!");
                    break;
            }

        } while (pilih != 0);

        System.out.println("Program selesai.");
    }
}