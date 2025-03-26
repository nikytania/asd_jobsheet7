import java.util.Scanner;

public class DosenMain18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen18 data = new DataDosen18();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah data dosen");
            System.out.println("2. Tampil data dosen");
            System.out.println("3. Sorting ASC (Bubble Sort)");
            System.out.println("4. Sorting DSC (Selection Sort)");
            System.out.println("5. Sorting DSC (Insertion Sort)");
            System.out.println("6. Pencarian Sequential (Nama)");
            System.out.println("7. Pencarian Binary (Usia)");
            System.out.println("8. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = sc.nextInt();
            sc.nextLine(); // Buang newline agar tidak mengganggu next input

            switch (pilihan) {
                case 1:
                    while (true) { // Perulangan untuk menambah lebih dari satu dosen
                        System.out.println("----------------------------------");
                        System.out.print("Masukkan kode dosen: ");
                        String kode = sc.nextLine();
                        System.out.print("Masukkan nama dosen: ");
                        String nama = sc.nextLine();
                        System.out.print("Jenis Kelamin (L/P): ");
                        boolean jk = sc.nextLine().trim().equalsIgnoreCase("L");
                        System.out.print("Masukkan usia dosen: ");
                        int usia = sc.nextInt();
                        sc.nextLine(); // Buang newline

                        Dosen18 dsn = new Dosen18(kode, nama, jk, usia);
                        data.tambah(dsn);

                        System.out.print("Tambah dosen lagi? (Y/N): ");
                        String lanjut = sc.nextLine().trim();
                        if (lanjut.equalsIgnoreCase("N")) {
                            break; // Keluar dari perulangan tambah data
                        }
                    }
                    break;
                case 2:
                    data.tampil();
                    break;
                case 3:
                    data.sortingASC();
                    System.out.println("Data dosen telah diurutkan secara ASCENDING (Usia termuda ke tertua)");
                    data.tampil();
                    break;
                case 4:
                    data.sortingDSC();
                    System.out.println("Data dosen telah diurutkan secara DESCENDING (Selection Sort) Usia tertua ke termuda");
                    data.tampil();
                    break;
                case 5:
                    data.insertionSort();
                    System.out.println("Data dosen telah diurutkan secara DESCENDING (Insertion Sort)");
                    data.tampil();
                    break;
                case 6:
                    System.out.print("Masukkan nama dosen yang dicari: ");
                    String namaCari = sc.nextLine();
                    data.PencarianDataSequential18(namaCari);
                    break;
                case 7:
                    System.out.print("Masukkan usia dosen yang dicari: ");
                    int usiaCari = sc.nextInt();
                    sc.nextLine(); // Buang newline
                    data.PencarianDataBinary(usiaCari);
                    break;
                case 8:
                    System.out.println("Keluar dari program");
                    return; // Hentikan program
                default:
                    System.out.println("Pilihan tidak valid! Coba lagi.");
            }
        }
    }
}