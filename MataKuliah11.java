public class MataKuliah11 {
    public String kodeMk;
    public String nama;
    public int sks;
    public int jumlahJam;


    public void tampilkanInformasi() {
        System.out.println("Kode Mata Kuliah: " + kodeMk);
        System.out.println("Nama Mata Kuliah: " + nama);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
    }

    public void ubahsks(int sksBaru) {
        sks = sksBaru;
    }

    public void tambahJam(int jamBaru) {
        jumlahJam += jamBaru;
    }

    public void kurangiJam(int jamKurang) {
        jumlahJam -= jamKurang;
    }
}
