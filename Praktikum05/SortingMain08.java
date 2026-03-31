package Praktikum05;

public class SortingMain08 {
    
    public static void main(String[] args) {
        int a[] = {20 ,10, 2, 7, 12};

        Sorting08 dataurut1 = new Sorting08(a, a.length);

        System.out.println("Data awal 1");
        dataurut1.tampil();
        dataurut1.bubbleSort();
        System.out.println("Data sudahdiurutkan dengan bubble sort (ASC)");
        dataurut1.tampil();
    }
}
