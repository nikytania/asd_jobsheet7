package Praktikum05;
import java.util.Scanner;

public class MahasiswaDemo18 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    MahasiswaBerprestasi18 list = new MahasiswaBerprestasi18();

    System.out.print("Masukkan jumlah mahasiswa: ");
    int jumlahMahasiswa = sc.nextInt();
    sc.nextLine(); 

    for (int i = 0; i < jumlahMahasiswa; i++) {
        System.out.println("\nMasukkan data mahasiswa ke-" + (i + 1));
        System.out.print("NIM: ");
        String nim = sc.nextLine();
        System.out.print("Nama: ");
        String nama = sc.nextLine();
        System.out.print("Kelas: ");
        String kelas = sc.nextLine();
        System.out.print("IPK: ");
        double ipk = sc.nextDouble();
        sc.nextLine(); 
        System.out.print("--------------------------------------");

        Mahasiswa m = new Mahasiswa(nim, nama, ipk, kelas);
        list.tambah(m);
    }

    System.out.println("Data mahasiswa sebelum sorting: ");
    list.tampil();

    System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC): ");
    list.bubbleSort();
    list.tampil();

    System.out.println("Data mahasiswa setelah sorting menggunakan SELECTION SORT (ASC):");
    list.selectionSort();
    list.tampil();

    System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC)");
    list.insertionSort();
    list.tampil();

  }
}



