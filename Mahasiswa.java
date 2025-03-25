package Praktikum05;

public class Mahasiswa {
  String nim;
  String nama;
  String kelas;
  double ipk;

  //konstruktor default
  Mahasiswa() {
  }

  //konstruktor berparameter (dibuat ada yang nama var parameter inputnya sama ada yang tidak)
  Mahasiswa(String nm, String name, double ip, String kls){
    nim = nm;
    nama = name;
    ipk = ip;
    kelas = kls;
  }
  void tampilInformasi(){
    System.out.println("Nama: " + nama);
    System.out.println("NIM: " + nim);
    System.out.println("IPK: " + ipk);
    System.out.println("Kelas: " + kelas);
    System.out.println("----------------------------------");
  }
}
