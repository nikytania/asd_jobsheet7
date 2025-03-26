import java.util.Scanner;

public class MahasiswaDemo18 {
  public static void main(String[] args) {
    MahasiswaBerprestasi18 list = new MahasiswaBerprestasi18();
    Scanner sc = new Scanner(System.in);
    int jumlahMahasiswa=5;

    for (int i = 0; i < jumlahMahasiswa; i++) {
        System.out.println("\nMasukkan data mahasiswa ke-" + (i + 1));
        System.out.print("NIM   : ");
        String nim = sc.nextLine();
        System.out.print("Nama  : ");
        String nama = sc.nextLine();
        System.out.print("Kelas : ");
        String kelas = sc.nextLine();
        System.out.print("IPK   : ");
        String ip = sc.nextLine();
        Double ipk = Double.parseDouble(ip);
        System.out.println("--------------------------------------");

        Mahasiswa m = new Mahasiswa(nim, nama, ipk, kelas);
        list.tambah(m);
    }
        list.tampil();
        //melakukan pencarian data sequential
        System.out.println("--------------------------------------------------------------");
        System.out.println("Pencarian Data");
        System.out.println("--------------------------------------------------------------");
        System.out.println("Masukkan ipk mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        double cari = sc.nextDouble();
          System.out.println("------------------------------");
          System.out.println("menggunakan binary search");
          System.out.println("------------------------------");
          double posisi2 = list.findBinarySearch(cari, 0, jumlahMahasiswa-1);
          int pss2 = (int)posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari,pss2);
  }
}



