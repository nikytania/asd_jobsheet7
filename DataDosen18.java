
public class DataDosen18 {
  Dosen18[] dataDosen = new Dosen18[10];
  int idx = 0;

  public void tambah(Dosen18 dsn) {
      if (idx < dataDosen.length) {
          dataDosen[idx] = dsn;
          idx++;
      } else {
          System.out.println("Data sudah penuh!");
      }
  }

  public void tampil() {
        if (idx == 0) {
            System.out.println("Tidak ada data dosen!");
         return;
        }
        for (int i = 0; i < idx; i++) {
            dataDosen[i].tampil();
        }
    }

  public void sortingASC() { // Bubble Sort
      for (int i = 0; i < idx - 1; i++) {
          for (int j = 0; j < idx - i - 1; j++) {
              if (dataDosen[j].usia > dataDosen[j + 1].usia) {
                  Dosen18 temp = dataDosen[j];
                  dataDosen[j] = dataDosen[j + 1];
                  dataDosen[j + 1] = temp;
              }
          }
      }
  }

  public void sortingDSC() { // Selection Sort
      for (int i = 0; i < idx - 1; i++) {
          int idxMax = i;
          for (int j = i + 1; j < idx; j++) {
              if (dataDosen[j].usia > dataDosen[idxMax].usia) {
                  idxMax = j;
              }
          }
          Dosen18 temp = dataDosen[idxMax];
          dataDosen[idxMax] = dataDosen[i];
          dataDosen[i] = temp;
      }
  }

  public void insertionSort() {
      for (int i = 1; i < idx; i++) {
          Dosen18 key = dataDosen[i];
          int j = i - 1;
          while (j >= 0 && dataDosen[j].usia < key.usia) {
              dataDosen[j + 1] = dataDosen[j];
              j--;
          }
          dataDosen[j + 1] = key;
      }
  }
  public void PencarianDataSequential18(String namaCari){
    boolean ditemukan = false;
    int count = 0;

    System.out.println("\nHasil Pencarian Sequential berdasarkan Nama: ");
    for (int i = 0; i < idx; i++){
        if (dataDosen[i].nama.equalsIgnoreCase(namaCari)){
            dataDosen[i].tampil();
            ditemukan = true;
            count++;
        }
    }
    if (!ditemukan){
        System.out.println("Dosen dengan nama " + namaCari+ " tidak ditemukan");
    } else if (count > 1) {
        System.out.println("Peringatan! Ditemukan lebih daro satu dosen dengan nama " + namaCari);
    }
  }
  public int binarySearch(int usiaCari, int left, int right){
    if (right >= left) {
        int mid = (left + right) / 2;
        if (dataDosen[mid].usia == usiaCari) {
            return mid;
        }
        if (dataDosen[mid].usia > usiaCari){
            return binarySearch(usiaCari, left, mid-1);
        }
        return binarySearch(usiaCari, mid+1, right);
    }
    return -1;
  }
  public void PencarianDataBinary(int usiaCari) {
    sortingASC(); // Binary search butuh data terurut ascending
    int hasil = binarySearch(usiaCari, 0, idx - 1);

    if (hasil != -1){
        System.out.println("\nHasil Pencarian Binary berdasarkan Usia:");
        dataDosen[hasil].tampil();

        // Cek jika ada usia yang sama
        int left = hasil - 1, right = hasil + 1;
        boolean adaLebihDariSatu = false;

        while (left >= 0 && dataDosen[left].usia == usiaCari){
            dataDosen[left].tampil();
            adaLebihDariSatu = true;
            left--;
        }
        while (right < idx && dataDosen[right].usia == usiaCari) {
            dataDosen[right].tampil();
            adaLebihDariSatu = true;
            right++;
        }

        if (adaLebihDariSatu) {
            System.out.println("Peringatan! Ditemukan lebih dari satu dosen dengan usia " + usiaCari);
        }
    }else {
        System.out.println("Dosen dengan usia " + usiaCari + " tidak ditemukan.");
        }
    }
}