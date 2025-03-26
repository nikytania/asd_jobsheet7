package Praktikum05;

public class DataDosen {
  Dosen[] dataDosen = new Dosen[10];
  int idx = 0;

  public void tambah(Dosen dsn) {
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
                  Dosen temp = dataDosen[j];
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
          Dosen temp = dataDosen[idxMax];
          dataDosen[idxMax] = dataDosen[i];
          dataDosen[i] = temp;
      }
  }

  public void insertionSort() {
      for (int i = 1; i < idx; i++) {
          Dosen key = dataDosen[i];
          int j = i - 1;
          while (j >= 0 && dataDosen[j].usia < key.usia) {
              dataDosen[j + 1] = dataDosen[j];
              j--;
          }
          dataDosen[j + 1] = key;
      }
  }
}