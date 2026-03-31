package LatihanPraktikum;

import java.util.Scanner;

public class DatanyaDosen {

    Dosen[] data = new Dosen[100];
    int idx = 0;

    // ================== TAMBAH ==================
    void tambah(Dosen d) {
        if (idx < data.length) {
            data[idx++] = d;
        } else {
            System.out.println("Data penuh!");
        }
    }

    // ================== INPUT ==================
    void inputData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jumlah dosen: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nData Dosen ke-" + (i + 1));

            System.out.print("Kode : ");
            String kd = sc.nextLine();

            System.out.print("Nama : ");
            String nm = sc.nextLine();

            System.out.print("Jenis Kelamin (L/P): ");
            char jkInput = sc.next().charAt(0);
            boolean jk = (jkInput == 'L' || jkInput == 'l');

            System.out.print("Usia : ");
            int usia = sc.nextInt();
            sc.nextLine();

            tambah(new Dosen(kd, nm, jk, usia));
        }
    }

    // TAmpil data dosen
    void tampil() {
        System.out.println("\n=== DATA DOSEN ===");
        for (int i = 0; i < idx; i++) {
            data[i].tampil();
        }
    }

    // bubble sort berdasarkan usia (termuda ke tertua)
    void sortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (data[j].usia > data[j + 1].usia) {
                    swap(j, j + 1);
                }
            }
        }
    }

    // sorting DSC (selection sort berdasarkan usia tertua ke termuda)
    void sortingDSC() {
        for (int i = 0; i < idx - 1; i++) {
            int max = i;
            for (int j = i + 1; j < idx; j++) {
                if (data[j].usia > data[max].usia) {
                    max = j;
                }
            }
            swap(i, max);
        }
    }

    // insertionsort
    void insertionSort() {
        for (int i = 1; i < idx; i++) {
            Dosen temp = data[i];
            int j = i;

            while (j > 0 && data[j - 1].usia > temp.usia) {
                data[j] = data[j - 1];
                j--;
            }
            data[j] = temp;
        }
    }


    void swap(int a, int b) {
        Dosen temp = data[a];
        data[a] = data[b];
        data[b] = temp;
    }
}